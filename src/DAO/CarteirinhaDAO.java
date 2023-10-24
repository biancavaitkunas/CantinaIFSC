package DAO;

import java.util.List;
import model.Carteirinha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarteirinhaDAO implements InterfaceDAO<Carteirinha>{

    @Override
    public void Creat(Carteirinha objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO carteirinha (codigoBarra, dataGeracao, dataCancelamento, cliente) VALUES (?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra());
            pstm.setString(2, objeto.getDataGeracao());
            pstm.setString(3, objeto.getDataCancelamento());
            pstm.setString(4, String.valueOf(objeto.getCliente()));
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
                
    }

    @Override
    public List<Carteirinha> Retrieve() {
        return null;
    }

    @Override
    public Carteirinha Retrieve(int parRk) {
        return null;
    }

    @Override
    public Carteirinha Retrieve(String parString) {
        return null;
    }

    @Override
    public void Update(Carteirinha objeto) {
    }

    @Override
    public void Delete(Carteirinha objeto) {
    }

}
