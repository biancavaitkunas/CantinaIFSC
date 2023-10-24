package DAO;

import java.util.List;
import model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnderecoDAO implements InterfaceDAO<Endereco>{

    @Override
    public void Creat(Endereco objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cidade (cep, logradouro, status, bairro, cidade) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCep());
            pstm.setString(2, objeto.getLogradouro());
            pstm.setString(3, String.valueOf(objeto.getStatus()));
            pstm.setString(4, String.valueOf(objeto.getBairro()));
            pstm.setString(5, String.valueOf(objeto.getCidade()));
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
                
    }

    @Override
    public List<Endereco> Retrieve() {
        return null;
    }

    @Override
    public Endereco Retrieve(int parRk) {
        return null;
    }

    @Override
    public Endereco Retrieve(String parString) {
        return null;
    }

    @Override
    public void Update(Endereco objeto) {
    }

    @Override
    public void Delete(Endereco objeto) {
    }

    
    
}
