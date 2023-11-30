package DAO;

import java.util.ArrayList;
import java.util.List;

import model.Bairro;
import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAO implements InterfaceDAO<Produto>{

    @Override
    public void create(Produto objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO produto (descricao, codigoBarra, status) VALUES (?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getCodigoBarra());
            pstm.setString(3, String.valueOf(objeto.getStatus()));
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
    }

    @Override
    public List<Produto> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT produto.id, "
        				   + "        produto.descricao, " 
        				   + "        produto.codigoBarra "
        				   + " FROM produto";
        				   
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Produto> listaProduto = new ArrayList<>();
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.executeQuery();
            while(rs.next()){
            	Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setCodigoBarra(rs.getString("codigoBarra"));
                produto.setStatus(rs.getString("status").charAt(0));
                listaProduto.add(produto);
            	
            }
        } catch(SQLException ex){
            
        } finally{
        	ConnectionFactory.closeConnection(conexao, pstm, rs);
            return listaProduto;
        }
    }

    public Produto retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT produto.id, "
                		   + "        produto.descricao, "
                		   + "        produto.codigoBarra, "
                		   + "        produto.status "
                		   + " FROM produto "
                                         + "  WHERE produto.id = ? ";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Produto produto = new Produto();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while (rst.next()) {

            	produto.setId(rst.getInt("id"));
            	produto.setDescricao(rst.getString("descricao"));
            	produto.setCodigoBarra(rst.getString("codigoBarra"));
            	produto.setStatus(rst.getString("status").charAt(0));
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return produto;
        }

    }

    @Override
    public List<Produto> retrieve(String parString) {
        return null;
    }

    public List<Produto> retrieve(String nomeParametro, String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT produto.id, "
     		   			   + "produto.descricao, "
     		   			   + "produto.codigoBarra, "
     		   			   + "produto.status, "
     		   			   + "FROM produto "
                           + " WHERE " + nomeParametro + " like ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Produto> listaProduto = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
            	
            	Produto produto = new Produto();
            	produto.setId(rst.getInt("id"));
            	produto.setDescricao(rst.getString("descricao"));
            	produto.setCodigoBarra(rst.getString("codigoBarra"));
            	produto.setStatus(rst.getString("status").charAt(0));
            	listaProduto.add(produto);
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaProduto;
        }
    }

    @Override
    public void update(Produto objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE produto "
        				   + "SET "
	    		   		   + "produto.descricao = ?, "
	    		   		   + "produto.codigoBarra = ? "
	    		   		   //+ "produto.status = ?  "
	    		   		   //+ "FROM produto "
	    		   		   + "produto.status = ?, "
	    		   		   + "FROM produto "
	    		   		   + " WHERE produto.id = ?";
        
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getCodigoBarra());
            pstm.setInt(3, objeto.getId());
            pstm.setString(3, objeto.getStatus()+"");
            pstm.setInt(4, objeto.getId());
            pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Produto objeto) {
    	
    	Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " DELETE * "
        				   + " FROM produto p"
        				   + " WHERE p.id = ?";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, objeto.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
    }
}
