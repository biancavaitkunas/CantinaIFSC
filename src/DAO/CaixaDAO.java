package DAO;

import java.util.List;
import model.Caixa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CaixaDAO implements InterfaceDAO<Caixa>{

    @Override
    public void create(Caixa objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO caixa (dataHoraAbertura, dataHoraFechamento, valorAbertura, valorFechamento, observacao, status, funcionario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDataHoraAbertura());
            pstm.setString(2, objeto.getDataHoraFechamento());
            pstm.setString(3, String.valueOf(objeto.getValorAbertura()));
            pstm.setString(4, String.valueOf(objeto.getValorFechamento()));
            pstm.setString(5, String.valueOf(objeto.getObservacao()));
            pstm.setString(6, String.valueOf(objeto.getStatus()));
            pstm.setString(7, String.valueOf(objeto.getFuncionario()));
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
                
    }

    @Override
    public List<Caixa> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, bairro.descricao FROM bairro";
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
    public Caixa retrieve(int parRk) {
        return null;
    }

    @Override
    public Caixa retrieve(String parString) {
        return null;
    }

    @Override
    public void update(Caixa objeto) {
    }

    @Override
    public void delete(Caixa objeto) {
    }

}
