package DAO;

import java.util.ArrayList;
import java.util.List;

import model.Bairro;
import model.Cidade;
import model.Cliente;
import model.Compra;
import model.Endereco;
import model.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompraDAO implements InterfaceDAO<Compra>{

    @Override
    public void create(Compra objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO compra (numeroNF, dataHoraCompra, valorDesconto, flagTipoDesconto, status, observacao, fornecedor) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
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
    public List<Compra> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT compra.id, "
        				   + "compra.numeroNF, "
        				   + "compra.dataHoraCompra, "
        				   + "compra.valorDesconto, "
        				   + "compra.flagTipoDesconto, "
        				   + "compra.status, "
        				   + "compra.observacao "
        				   + "compra.fornecedor "
        				   + "FROM compra";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Compra> listaCompra = new ArrayList<>();
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.executeQuery();
            while(rst.next()){
            	
            	Compra compra = new Compra();
            	compra.setId(rst.getInt("id"));
            	compra.setNumeroNF(rst.getInt("numeroNF"));
            	compra.setDataHoraCompra(rst.getString("dataHoraCompra"));
            	compra.setValorDesconto(rst.getFloat("valorDesconto"));
            	compra.setFlagTipoDesconto(rst.getString("flagTipoDesconto").charAt(0));
            	compra.setStatus(rst.getString("status").charAt(0));
            	compra.setObservacao(rst.getString("status"));

                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rst.getInt("id"));
            	fornecedor.setCnpj(rst.getString("cnpj"));
            	fornecedor.setInscricaoEstadual(rst.getString("inscricaoEstadual"));
            	fornecedor.setRazaoSocial(rst.getString("razaoSocial"));
            	fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
            	fornecedor.setEmail(rst.getString("email"));
            	fornecedor.setFone1(rst.getString("fone1"));
            	fornecedor.setFone2(rst.getString("fone2"));
            	fornecedor.setNome(rst.getString("nome"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                compra.setFornecedor(fornecedor);

                listaCompra.add(compra);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCompra;
        }
    }

    public Compra retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT c.id, "
				   		   + "        c.numeroNF, "
				   		   + "        c.dataHoraCompra, "
				   		   + "        c.valorDesconto, "
				   		   + "        c.flagTipoDesconto, "
				   		   + "        c.status, "
				   		   + "        c.observacao "
				   		   + "        c.fornecedor "
				   		   + " FROM compra c"
				   		   + "      LEFT OUTER JOIN fornecedor f ON f.id = c.id "
                           + "  WHERE c.id = ? ";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Compra compra = new Compra();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while (rst.next()) {

            	compra.setId(rst.getInt("id"));
            	compra.setNumeroNF(rst.getInt("numeroNF"));
            	compra.setDataHoraCompra(rst.getString("dataHoraCompra"));
            	compra.setValorDesconto(rst.getFloat("valorDesconto"));
            	compra.setFlagTipoDesconto(rst.getString("flagTipoDesconto").charAt(0));
            	compra.setStatus(rst.getString("status").charAt(0));
            	compra.setObservacao(rst.getString("status"));
            	
            	Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rst.getInt("id"));
            	fornecedor.setCnpj(rst.getString("cnpj"));
            	fornecedor.setInscricaoEstadual(rst.getString("inscricaoEstadual"));
            	fornecedor.setRazaoSocial(rst.getString("razaoSocial"));
            	fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
            	fornecedor.setEmail(rst.getString("email"));
            	fornecedor.setFone1(rst.getString("fone1"));
            	fornecedor.setFone2(rst.getString("fone2"));
            	fornecedor.setNome(rst.getString("nome"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                compra.setFornecedor(fornecedor);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return compra;
        }

    }

    @Override
    public List<Compra> retrieve(String parString) {
        return null;
    }

    public List<Compra> retrieve(String nomeParametro, String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT c.id, "
		   		           + "        c.numeroNF, "
		   		           + "        c.dataHoraCompra, "
		   		           + "        c.valorDesconto, "
		   		           + "        c.flagTipoDesconto, "
		   		           + "        c.status, "
		   	               + "        c.observacao "
		   		           + "        c.fornecedor "
		   		           + " FROM compra c"
		   		           + "      LEFT OUTER JOIN fornecedor f ON f.id = c.id "
                           + " WHERE " + nomeParametro + " like ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Compra> listaCliente = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
            	Compra compra = new Compra();
            	compra.setId(rst.getInt("id"));
            	compra.setNumeroNF(rst.getInt("numeroNF"));
            	compra.setDataHoraCompra(rst.getString("dataHoraCompra"));
            	compra.setValorDesconto(rst.getFloat("valorDesconto"));
            	compra.setFlagTipoDesconto(rst.getString("flagTipoDesconto").charAt(0));
            	compra.setStatus(rst.getString("status").charAt(0));
            	compra.setObservacao(rst.getString("status"));
            	
            	Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rst.getInt("id"));
            	fornecedor.setCnpj(rst.getString("cnpj"));
            	fornecedor.setInscricaoEstadual(rst.getString("inscricaoEstadual"));
            	fornecedor.setRazaoSocial(rst.getString("razaoSocial"));
            	fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
            	fornecedor.setEmail(rst.getString("email"));
            	fornecedor.setFone1(rst.getString("fone1"));
            	fornecedor.setFone2(rst.getString("fone2"));
            	fornecedor.setNome(rst.getString("nome"));
                fornecedor.setStatus(rst.getString("status").charAt(0));
                compra.setFornecedor(fornecedor);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCliente;
        }
    }

    @Override
    public void update(Compra objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " UPDATE compra c, "
	    		   		   + "        SET "
		   		           + "        c.numeroNF = ?, "
		   		           + "        c.dataHoraCompra = ?, "
		   		           + "        c.valorDesconto  = ?, "
		   		           + "        c.flagTipoDesconto = ?, "
		   		           + "        c.status = ?, "
		   	               + "        c.observacao = ?, "
		   		           + "        c.fornecedor = ? "
		   		           + " FROM compra c"
	    		   		   + "    WHERE cliente.id = ?";
        
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, objeto.getNumeroNF());
            pstm.setString(2, objeto.getDataHoraCompra());
            pstm.setFloat(3, objeto.getValorDesconto());
            pstm.setString(4, objeto.getFlagTipoDesconto()+"");
            pstm.setString(5, objeto.getStatus()+"");
            pstm.setString(6, objeto.getObservacao());
            pstm.setString(7, String.valueOf(objeto.getFornecedor()));
            pstm.setString(8, objeto.getStatus()+"");
            pstm.setInt(9, objeto.getId());
            pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Compra objeto) {
    	
    	Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " DELETE * "
        				   + " FROM compra c"
        				   + " WHERE c.id = ?";
        
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
