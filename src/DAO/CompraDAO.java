package DAO;

import java.util.List;
import model.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompraDAO implements InterfaceDAO<Compra>{

    @Override
    public void Creat(Compra objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO compra (numeroNF, dataHoraCompra, valorDesconto, flagTipoDesconto, status, observacao) VALUES (?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDataHoraCompra());
            pstm.setString(2, objeto.getObservacao());
            pstm.setString(3, String.valueOf(objeto.getNumeroNF()));
            pstm.setString(5, String.valueOf(objeto.getValorDesconto()));
            pstm.setString(6, String.valueOf(objeto.getStatus()));
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
          
    }

    @Override
    public List<Compra> Retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT compra.id, compra.numeroNF, compra.dataHoraCompra, compra.valorDesconto, compra.flagTipoDesconto, compra.status, compra.observacao FROM compra";
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
    public Compra Retrieve(int parRk) {
        return null;
    }

    @Override
    public Compra Retrieve(String parString) {
        return null;
    }

    @Override
    public void Update(Compra objeto) {
    }

    @Override
    public void Delete(Compra objeto) {
    }

}
