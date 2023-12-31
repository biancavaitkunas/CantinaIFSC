package DAO;

import java.util.ArrayList;
import java.util.List;
import model.ItemVenda;
import model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Endereco;

public class ItemVendaDAO implements InterfaceDAO<ItemVenda>{

    @Override
    public void create(ItemVenda objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO itemVenda (qtdProduto, valorUnitario, status, venda_id, produto_id) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, objeto.getQtdProduto());
            pstm.setDouble(2, objeto.getValorUnitario());
            pstm.setString(3, objeto.getStatus()+"");
            pstm.setInt(4, objeto.getVenda().getId());
            pstm.setInt(5, objeto.getProduto().getId());
            System.out.println(sqlExecutar);
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
    }

    @Override
    public List<ItemVenda> retrieve() {
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
        List<ItemVenda> listaCliente = new ArrayList<>();

        /*try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            while (rst.next()) {
            	ItemVenda cliente = new ItemVenda();

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

    public ItemVenda retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT itemVenda.id, "
                		   + "itemVenda.valorUnitario, "
                		   + "produto.descricao, "
                		   + "itemVenda.produto_id "
                		   + "FROM itemVenda "
                		   + " LEFT OUTER JOIN produto ON produto.id = itemVenda.produto_id "
                           + " WHERE itemVenda.id = ? ";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        ItemVenda itemVenda = new ItemVenda();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while (rst.next()) {

            	itemVenda.setId(rst.getInt("id"));
                Produto prod = new Produto();
                prod.setId(rst.getInt("produto_id"));
                prod.setDescricao(rst.getString("descricao"));
                itemVenda.setProduto(prod);

                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return itemVenda;
        }

    }

    @Override
    public List<ItemVenda> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT *"
                + " FROM cliente "
                + " WHERE nome like ?";

        /*PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Cliente> listaBairro = new ArrayList<>();

        try {
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

    public List<ItemVenda> retrieve(String nomeParametro, String parString) {
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
        List<ItemVenda> listaCliente = new ArrayList<>();

       /* try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
            	ItemVenda cliente = new ItemVenda();

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
       return listaCliente;
    }

    @Override
    public void update(ItemVenda objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE cliente SET  "
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
	    		   		   + "cliente.endereco_id = ? "
	    		   		   //+ "FROM cliente "
	    		   		   //+ " LEFT OUTER JOIN endereco ON endereco.id = cliente.endereco "
	    		   		   + "FROM cliente "
	    		   		   + " LEFT OUTER JOIN endereco ON endereco.id = cliente.endereco "
	    		   		   + " WHERE cliente.id = ?";
        
        PreparedStatement pstm = null;

       /* try {
           /* pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCpf());
            pstm.setString(2, objeto.getRg());
            pstm.setString(3, objeto.getMatricula());
            pstm.setString(4, objeto.getDataNascimento());
            pstm.setString(5, objeto.getNome());
            pstm.setString(6, objeto.getFone1());
            pstm.setString(7, objeto.getFone2());
            pstm.setString(8, objeto.getEmail());
            pstm.setString(9, objeto.getStatus()+"");
            pstm.setString(10, objeto.getComplementoEndereco());
            pstm.setInt(11, objeto.getEndereco().getId());
            pstm.setInt(12, objeto.getId());
            pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }*/
    }

    @Override
    public void delete(ItemVenda objeto) {
    	
    }

}
