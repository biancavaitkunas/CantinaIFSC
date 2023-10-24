package DAO;

import java.util.List;
import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO implements InterfaceDAO<Cliente>{

    @Override
    public void Creat(Cliente objeto) {
        
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
    public List<Cliente> Retrieve() {
        return null;
    }

    @Override
    public Cliente Retrieve(int parRk) {
        return null;
    }

    @Override
    public Cliente Retrieve(String parString) {
        return null;
    }

    @Override
    public void Update(Cliente objeto) {
    }

    @Override
    public void Delete(Cliente objeto) {
    }

}
