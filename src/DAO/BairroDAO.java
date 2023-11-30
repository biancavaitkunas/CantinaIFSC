package DAO;

import java.util.List;
import model.Bairro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cidade;

public class BairroDAO implements InterfaceDAO<Bairro>{

    @Override
    public void create(Bairro objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO bairro (descricao) VALUES (?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
    }

    @Override
    public List<Bairro> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, bairro.descricao FROM bairro";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Bairro> listaBairro = new ArrayList<>();
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Bairro bairro = new Bairro();
                bairro.setId(rs.getInt("id"));
                bairro.setDescricao(rs.getString("descricao"));
                listaBairro.add(bairro);
                
            }
        } catch(SQLException ex){
            ex.printStackTrace();
            
        } finally{
            ConnectionFactory.closeConnection(conexao, pstm, rs);
            return listaBairro;
        }
        
    }

    @Override
    public Bairro retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, "
                                       + "bairro.descricao "
                                       + "FROM bairro "
                                       + " WHERE bairro.id = ? ";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Bairro bairro = new Bairro();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while (rst.next()) {
                bairro.setId(rst.getInt("id"));
                bairro.setDescricao(rst.getString("descricao"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return bairro;
        }
    }

    @Override
    public List<Bairro> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT bairro.id, "
                + " bairro.descricao "
                + " FROM bairro "
                + " WHERE descricao like ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Bairro> listaBairro = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
                Bairro bairro = new Bairro();
                bairro.setId(rst.getInt("id"));
                bairro.setDescricao(rst.getString("descricao"));
                listaBairro.add(bairro);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaBairro;
        }
    }

    @Override
    public void update(Bairro objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " UPDATE bairro"
                                       + " SET "
                                       + " bairro.descricao = ? "
                                       + " WHERE bairro.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setInt(2, objeto.getId());
            pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Bairro objeto) {
    	
    	Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " DELETE * "
        				   + " FROM bairro b "
        				   + " WHERE b.id = ?";
        
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
