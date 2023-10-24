package DAO;

import java.util.List;
import model.Cidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CidadeDAO implements InterfaceDAO<Cidade>{

    @Override
    public void Creat(Cidade objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cidade (descricao, uf) VALUES (?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getUf());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
                
    }

    @Override
    public List<Cidade> Retrieve() {
        return null;
    }

    @Override
    public Cidade Retrieve(int parRk) {
        return null;
    }

    @Override
    public Cidade Retrieve(String parString) {
        return null;
    }

    @Override
    public void Update(Cidade objeto) {
    }

    @Override
    public void Delete(Cidade objeto) {
    }

    
    
}
