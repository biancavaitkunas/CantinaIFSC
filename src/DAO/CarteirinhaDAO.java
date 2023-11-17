package DAO;

import java.util.List;
import model.Carteirinha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import model.Fornecedor;

public class CarteirinhaDAO implements InterfaceDAO<Carteirinha>{

    @Override
    public void create(Carteirinha objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO carteirinha (codigoBarra, dataGeracao, dataCancelamento, cliente) VALUES (?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra());
            pstm.setString(2, objeto.getDataGeracao());
            pstm.setString(3, objeto.getDataCancelamento());
            pstm.setInt(4, objeto.getCliente().getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
    }

    @Override
    public List<Carteirinha> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT *  "
                           + "FROM carteirinha "
                           + " LEFT OUTER JOIN cliente ON cliente.id = carteirinha.cliente_id ";
                ;
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Carteirinha> listaFornecedor = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            while (rst.next()) {
            	Carteirinha fornecedor = new Carteirinha();

            	fornecedor.setId(rst.getInt("id"));
            	//fornecedor.setCliente(rst.getString("cnpj"));
            	fornecedor.setCodigoBarra(rst.getString("codigoBarra"));
            	fornecedor.setDataGeracao(rst.getString("dataGeracao"));
            	fornecedor.setDataCancelamento(rst.getString("dataCancelamento"));
                listaFornecedor.add(fornecedor);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaFornecedor;
        }
    }

    @Override
    public Carteirinha retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * "
                		   + "FROM carteirinha "
                		   + " LEFT OUTER JOIN cliente ON cliente.id = carteirinha.cliente_id "
                           + " WHERE carteirinha.id = ? ";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Carteirinha cliente = new Carteirinha();
        //criei o objeto fornecedor fora do bloco protegido
        //para que seu escopo permita carregá-lo como retorno do método
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while (rst.next()) {

            	cliente.setId(rst.getInt("id"));
            	cliente.setCodigoBarra(rst.getString("cpf"));
            	cliente.setDataGeracao(rst.getString("rg"));
            	cliente.setDataCancelamento(rst.getString("dataNascimento"));
                Cliente bairro = new Cliente();
                bairro.setId(rst.getInt("id"));
                bairro.setNome(rst.getString("nome"));
                bairro.setCpf(rst.getString("cpf"));
                bairro.setRg(rst.getString("rg"));
                bairro.setDataNascimento(rst.getString("dataNascimento"));
                bairro.setMatricula(rst.getString("matricula"));
                cliente.setCliente(bairro);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cliente;
        }
    }

    @Override
    public List<Carteirinha> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT * "
                //+ " bairro.descricao "
                + " FROM carteirinha "
                + " WHERE codigoBarra like ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Carteirinha> listaBairro = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
                Carteirinha bairro = new Carteirinha();
                bairro.setId(rst.getInt("id"));
                bairro.setCodigoBarra(rst.getString("codigoBarra"));
                bairro.setDataGeracao(rst.getString("dataGeracao"));
                bairro.setDataCancelamento(rst.getString("dataCancelamento"));
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
    public void update(Carteirinha objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE carteirinha SET  "
        		+ "carteirinha.codigoBarra = ?, "
                + "carteirinha.dataCancelamento = ?, "
                + "carteirinha.dataGeracao = ? "
                //+ "FROM fornecedor "
                + " WHERE carteirinha.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra());
            pstm.setString(2, objeto.getDataCancelamento());
            pstm.setString(3, objeto.getDataGeracao());
            pstm.setInt(4, objeto.getId());
            pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Carteirinha objeto) {
    }

}
