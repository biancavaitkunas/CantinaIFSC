package DAO;

import java.util.List;
import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO implements InterfaceDAO<Cliente>{

    @Override
    public void create(Cliente objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cliente (cpf, rg, matricula, dataNascimento) VALUES (?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCpf());
            pstm.setString(2, objeto.getRg());
            pstm.setString(3, objeto.getMatricula());
            pstm.setString(4, String.valueOf(objeto.getDataNascimento()));
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
                
    }

    @Override
    public List<Cliente> retrieve() {
        return null;
    }

    @Override
    public Cliente retrieve(int parRk) {
        return null;
    }

    @Override
    public Cliente retrieve(String parString) {
        return null;
    }

    @Override
    public void update(Cliente objeto) {
    }

    @Override
    public void delete(Cliente objeto) {
    }

}
