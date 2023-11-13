package DAO;

import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FornecedorDAO implements InterfaceDAO<Fornecedor>{

    @Override
    public void create(Fornecedor objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO fornecedor (cnpj, inscricaoEstadual, razaoSocial) VALUES (?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCnpj());
            pstm.setString(2, objeto.getRazaoSocial());
            pstm.setString(3, objeto.getInscricaoEstadual());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
                
    }

    @Override
    public List<Fornecedor> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT fornecedor.id, "
                           + "fornecedor.inscricaoEstadual, "
                           + "fornecedor.razaoSocial, "
                           + "FROM fornecedor "
                           + " LEFT OUTER JOIN BAIRRO ON BAIRRO.id = ENDERECO.bairro_id "
                           + " LEFT OUTER JOIN CIDADE ON CIDADE.id = ENDERECO.Cidade_id ";
                
                
                ;
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Fornecedor> listaFornecedor = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            while (rst.next()) {
            	Fornecedor fornecedor = new Fornecedor();

            	fornecedor.setId(rst.getInt("id"));
            	fornecedor.setCnpj(rst.getString("cnpj"));
            	fornecedor.setInscricaoEstadual(rst.getString("inscricaoEstadual"));
            	fornecedor.setRazaoSocial(rst.getString("razaoSocial"));
            	fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
            	fornecedor.setEmail(rst.getString("email"));
            	fornecedor.setFone1(rst.getString("fone1"));
            	fornecedor.setFone2(rst.getString("fone2"));
            	fornecedor.setNome(rst.getString("nome"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                listaFornecedor.add(fornecedor);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaFornecedor;
        }
    }

    public Fornecedor retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT fornecedor.id, "
                           + "fornecedor.inscricaoEstadual, "
                           + "fornecedor.razaoSocial, "
                           + "fornecedor.complementoEndereco, "
                           + "fornecedor.email, "
                           + "fornecedor.fone1, "
                           + "fornecedor.fone2 , "
                           + "fornecedor.nome , "
                           + "fornecedor.status "                
                           + "FROM fornecedor "
                           + " WHERE fornecedor.id = ? ";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Fornecedor fornecedor = new Fornecedor();
        //criei o objeto fornecedor fora do bloco protegido
        //para que seu escopo permita carregá-lo como retorno do método
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while (rst.next()) {

            	fornecedor.setId(rst.getInt("id"));
            	fornecedor.setCnpj(rst.getString("cnpj"));
            	fornecedor.setInscricaoEstadual(rst.getString("inscricaoEstadual"));
            	fornecedor.setRazaoSocial(rst.getString("razaoSocial"));
            	fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
            	fornecedor.setEmail(rst.getString("email"));
            	fornecedor.setFone1(rst.getString("fone1"));
            	fornecedor.setFone2(rst.getString("fone2"));
            	fornecedor.setNome(rst.getString("nome"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return fornecedor;
        }

    }

    @Override
    public List<Fornecedor> retrieve(String parString) {
        return null;
    }

    public List<Fornecedor> retrieve(String nomeParametro, String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT fornecedor.id, "
                + "fornecedor.inscricaoEstadual, "
                + "fornecedor.razaoSocial, "
                + "fornecedor.complementoEndereco, "
                + "fornecedor.email, "
                + "fornecedor.fone1, "
                + "fornecedor.fone2 , "
                + "fornecedor.nome , "
                + "fornecedor.status "                
                + "FROM fornecedor "
                + " WHERE " + nomeParametro + " like ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Fornecedor> listaFornecedor = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
            	Fornecedor fornecedor = new Fornecedor();

            	fornecedor.setId(rst.getInt("id"));
            	fornecedor.setCnpj(rst.getString("cnpj"));
            	fornecedor.setInscricaoEstadual(rst.getString("inscricaoEstadual"));
            	fornecedor.setRazaoSocial(rst.getString("razaoSocial"));
            	fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
            	fornecedor.setEmail(rst.getString("email"));
            	fornecedor.setFone1(rst.getString("fone1"));
            	fornecedor.setFone2(rst.getString("fone2"));
            	fornecedor.setNome(rst.getString("nome"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                listaFornecedor.add(fornecedor);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaFornecedor;
        }
    }

    @Override
    public void update(Fornecedor objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE fornecedor, "
        		+ "fornecedor.cnpj = ?, "
                + "fornecedor.inscricaoEstadual = ?, "
                + "fornecedor.razaoSocial = ?, "
                + "fornecedor.complementoEndereco = ?, "
                + "fornecedor.email = ?, "
                + "fornecedor.fone1 = ?, "
                + "fornecedor.fone2 = ?, "
                + "fornecedor.nome = ?, "
                + "fornecedor.status = ?"                
                + "FROM fornecedor "
                + " WHERE endereco.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCnpj());
            pstm.setString(2, objeto.getInscricaoEstadual());
            pstm.setString(3, objeto.getRazaoSocial());
            pstm.setString(4, objeto.getComplementoEndereco());
            pstm.setString(5, objeto.getEmail());
            pstm.setString(6, objeto.getFone1());
            pstm.setString(7, objeto.getFone2());
            pstm.setString(8, objeto.getNome());
            pstm.setString(9, objeto.getStatus()+"");
            pstm.setInt(10, objeto.getId());
            pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Fornecedor objeto) {
    	
    	Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " DELETE * "
        				   + " FROM fornecedor f "
        				   + " WHERE f.id = ?";
        
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
