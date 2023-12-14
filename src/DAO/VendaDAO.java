package DAO;

import java.util.ArrayList;
import java.util.List;
import model.Venda;
import model.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Endereco;

public class VendaDAO implements InterfaceDAO<Venda>{

    @Override
    public void create(Venda objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO venda (dataHoraVenda, valorDesconto, flagTipoDesconto, observacao, status, carteirinha_id, funcionario_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setDate(1, new java.sql.Date(objeto.getDataHoraVenda().getTime()));
            pstm.setFloat(2, objeto.getValorDesconto());
            pstm.setString(3, objeto.getFlagTipoDesconto());
            pstm.setString(4, objeto.getObservacao());
            pstm.setString(5, String.valueOf(objeto.getStatus()));
            pstm.setInt(6, objeto.getCarteirinha().getId());
            pstm.setInt(7, objeto.getFuncionario().getId());
            pstm.execute();
                        System.out.println("SQL VENDA:  "+sqlExecutar);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
                
    }

    @Override
    public List<Venda> retrieve() {
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
                           + "cliente.endereco_id "
                           + "FROM cliente "
                           + " LEFT OUTER JOIN endereco ON endereco.id = cliente.endereco_id ";
                
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Venda> listaCliente = new ArrayList<>();

        /*try {
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
        }*/
        return null;
    }

    public Venda retrieve(int parPK) {
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
                		   + "cliente.endereco_id "
                		   + "FROM cliente "
                		   + " LEFT OUTER JOIN endereco ON endereco.id = cliente.endereco_id "
                           + " WHERE cliente.id = ? ";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Venda cliente = new Venda();
        //criei o objeto fornecedor fora do bloco protegido
        //para que seu escopo permita carregá-lo como retorno do método
        
        /*try {
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
//            	cliente.setFone1(rst.getString("fone1"));
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
        }*/
        
        return null;

    }

    @Override
    public List<Venda> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT *"
                + " FROM cliente "
                + " WHERE nome like ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Venda> listaBairro = new ArrayList<>();

        /*try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
                Cliente bairro = new Cliente();
                bairro.setId(rst.getInt("id"));
                bairro.setNome(rst.getString("nome"));
                bairro.setCpf(rst.getString("cpf"));
                bairro.setRg(rst.getString("rg"));
                bairro.setDataNascimento(rst.getString("dataNascimento"));
                bairro.setMatricula(rst.getString("matricula"));
                listaBairro.add(bairro);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaBairro;
        }*/
        
        return null;
    }

    public List<Venda> retrieve(String nomeParametro, String parString) {
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
     		    		   + " cliente.endereco_id "
     		    		   + " FROM cliente "
     		    		   + " LEFT OUTER JOIN endereco ON endereco.id = cliente.endereco_id "
                           + " WHERE " + nomeParametro + " like ? ";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Venda> listaCliente = new ArrayList<>();

        /*try {
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
                
                Endereco endereco = new Endereco();
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("logradouro"));
                endereco.setStatus(rst.getString("status").charAt(0));
                endereco.setCep(rst.getString("cep"));
                cliente.setEndereco(endereco);
            	listaCliente.add(cliente);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCliente;
        }*/
        return null;
    }

    @Override
    public void update(Venda objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE venda SET  "
	    		   		   + "venda.flagTipoDesconto = ?, "
	    		   		   + "venda.observacao = ?, "
	    		   		   + "venda.status = ?, "
	    		   		   + "venda.valorDesconto = ? "
	    		   		   //+ " LEFT OUTER JOIN endereco ON endereco.id = cliente.endereco "
	    		   		   + " WHERE venda.id = ?";
        
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getFlagTipoDesconto());
            pstm.setString(2, objeto.getObservacao());
            pstm.setString(3, objeto.getStatus()+"");
            pstm.setFloat(4, objeto.getValorDesconto());
            pstm.setInt(5, objeto.getId());
            pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Venda objeto) {
    	
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
    
    public int getMaiorId(){
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT MAX(id) AS ultimo FROM cantina.venda ";
                           
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        int ultimoCod = 0;
        //Cidade cidade = new Cidade();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            //pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while (rst.next()) {
                
                ultimoCod = rst.getInt("ultimo");
               
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return ultimoCod;
        }
    }

}
