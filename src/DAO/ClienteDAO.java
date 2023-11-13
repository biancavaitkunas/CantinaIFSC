package DAO;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO implements InterfaceDAO<Cliente>{

    @Override
    public void create(Cliente objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cliente (cpf, rg, matricula, dataNascimento, nome, fone1, fone2, email, status, complementoEndereco, endereco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
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
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cliente.id, "
                           + "cliente.cpf, "
                           + "cliente.rg, "
                           + "cliente.matricula, "
                           + "cliente.dataNascimento, "
                           + "cliente.nome, "
                           + "cliente.fone1, "
                           + "cliente.fone2, "
                           + "cliente.email, "
                           + "cliente.status, "
                           + "cliente.complementoEndereco, "
                           + "cliente.endereco, "
                           + "FROM cliente "
                           + " LEFT OUTER JOIN endereco ON endereco.id = cliente.endereco ";
                
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Cliente> listaCliente = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            while (rst.next()) {
            	Cliente cliente = new Cliente();

            	cliente.setId(rst.getInt("id"));
            	cliente.setCpf(rst.getString("cpf"));
            	cliente.setRg(rst.getString("rg"));
            	cliente.setDataNascimento(rst.getString("dataNascimento"));
            	cliente.setMatricula(rst.getString("matricula"));
            	cliente.setComplementoEndereco(rst.getString("complementoEndereco"));
            	cliente.setEmail(rst.getString("email"));
            	cliente.setFone1(rst.getString("fone1"));
            	cliente.setFone2(rst.getString("fone2"));
            	cliente.setNome(rst.getString("nome"));
            	cliente.setStatus(rst.getString("status").charAt(0));
            	listaCliente.add(cliente);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCliente;
        }
    }

    public Cliente retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cliente.id, "
                		   + "cliente.cpf, "
                		   + "cliente.rg, "
                		   + "cliente.matricula, "
                		   + "cliente.dataNascimento, "
                		   + "cliente.nome, "
                		   + "cliente.fone1, "
                		   + "cliente.fone2, "
                		   + "cliente.email, "
                		   + "cliente.status, "
                		   + "cliente.complementoEndereco, "
                		   + "cliente.endereco, "
                		   + "FROM cliente "
                		   + " LEFT OUTER JOIN endereco ON endereco.id = cliente.endereco "
                           + " WHERE cliente.id = ? ";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Cliente cliente = new Cliente();
        //criei o objeto fornecedor fora do bloco protegido
        //para que seu escopo permita carregá-lo como retorno do método
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while (rst.next()) {

            	cliente.setId(rst.getInt("id"));
            	cliente.setCpf(rst.getString("cpf"));
            	cliente.setRg(rst.getString("rg"));
            	cliente.setDataNascimento(rst.getString("dataNascimento"));
            	cliente.setMatricula(rst.getString("matricula"));
            	cliente.setComplementoEndereco(rst.getString("complementoEndereco"));
            	cliente.setEmail(rst.getString("email"));
            	cliente.setFone1(rst.getString("fone1"));
            	cliente.setFone2(rst.getString("fone2"));
            	cliente.setNome(rst.getString("nome"));
            	cliente.setStatus(rst.getString("status").charAt(0));
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cliente;
        }

    }

    @Override
    public List<Cliente> retrieve(String parString) {
        return null;
    }

    public List<Cliente> retrieve(String nomeParametro, String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cliente.id, "
     		    		   + "cliente.cpf, "
     		    		   + "cliente.rg, "
     		    		   + "cliente.matricula, "
     		    		   + "cliente.dataNascimento, "
     		    		   + "cliente.nome, "
     		    		   + "cliente.fone1, "
     		    		   + "cliente.fone2, "
     		    		   + "cliente.email, "
     		    		   + "cliente.status, "
     		    		   + "cliente.complementoEndereco, "
     		    		   + "cliente.endereco, "
     		    		   + "FROM cliente "
     		    		   + " LEFT OUTER JOIN endereco ON endereco.id = cliente.endereco "
                           + " WHERE " + nomeParametro + " like ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Cliente> listaCliente = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
            	Cliente cliente = new Cliente();

            	cliente.setId(rst.getInt("id"));
            	cliente.setCpf(rst.getString("cpf"));
            	cliente.setRg(rst.getString("rg"));
            	cliente.setDataNascimento(rst.getString("dataNascimento"));
            	cliente.setMatricula(rst.getString("matricula"));
            	cliente.setComplementoEndereco(rst.getString("complementoEndereco"));
            	cliente.setEmail(rst.getString("email"));
            	cliente.setFone1(rst.getString("fone1"));
            	cliente.setFone2(rst.getString("fone2"));
            	cliente.setNome(rst.getString("nome"));
            	cliente.setStatus(rst.getString("status").charAt(0));
            	listaCliente.add(cliente);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCliente;
        }
    }

    @Override
    public void update(Cliente objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE cliente, "
	    		   		   + "cliente.cpf = ?, "
	    		   		   + "cliente.rg = ?, "
	    		   		   + "cliente.matricula = ?, "
	    		   		   + "cliente.dataNascimento = ?, "
	    		   		   + "cliente.nome = ?, "
	    		   		   + "cliente.fone1 = ?, "
	    		   		   + "cliente.fone2 = ?, "
	    		   		   + "cliente.email = ?, "
	    		   		   + "cliente.status = ?, "
	    		   		   + "cliente.complementoEndereco = ?, "
	    		   		   + "cliente.endereco = ?, "
	    		   		   + "FROM cliente "
	    		   		   + " LEFT OUTER JOIN endereco ON endereco.id = cliente.endereco "
	    		   		   + " WHERE cliente.id = ?";
        
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCpf());
            pstm.setString(2, objeto.getRg());
            pstm.setString(3, objeto.getMatricula());
            pstm.setString(4, objeto.getDataNascimento());
            pstm.setString(5, objeto.getComplementoEndereco());
            pstm.setString(6, objeto.getEmail());
            pstm.setString(7, objeto.getFone1());
            pstm.setString(8, objeto.getFone2());
            pstm.setString(9, objeto.getNome());
            pstm.setString(10, objeto.getStatus()+"");
            pstm.setInt(11, objeto.getId());
            pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Cliente objeto) {
    	
    	Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " DELETE * "
        				   + " FROM cliente c"
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
