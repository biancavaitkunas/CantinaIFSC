package DAO;

import java.util.List;
import model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorDAO implements InterfaceDAO<Fornecedor>{

    @Override
    public void create(Fornecedor objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO carteirinha (cnpj, inscricaoEstadual, razaoSocial) VALUES (?, ?, ?)";
        
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
        return null;
    }

    @Override
    public Fornecedor retrieve(int parRk) {
        return null;
    }

    @Override
    public Fornecedor retrieve(String parString) {
        return null;
    }

    @Override
    public void update(Fornecedor objeto) {
    }

    @Override
    public void delete(Fornecedor objeto) {
    }

}
