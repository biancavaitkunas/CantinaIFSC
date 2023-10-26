package DAO;

import java.util.List;
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
        String sqlExecutar = "SELECT produto.id, produto.descricao, produto.codigoBarra FROM produto";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.executeQuery();
            while(rs.next()){
                
            }
        } catch(SQLException ex){
            
        } finally{
            
        }
        return null;
    }

    @Override
    public Produto retrieve(int parRk) {
        return null;
    }

    @Override
    public Produto retrieve(String parString) {
        return null;
    }

    @Override
    public void update(Produto objeto) {
    }

    @Override
    public void delete(Produto objeto) {
    }

}
