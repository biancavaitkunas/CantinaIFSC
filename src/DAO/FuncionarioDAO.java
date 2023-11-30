                            ´~package DAO;

import java.util.List;
import model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Bairro;
import model.Cidade;
import model.Endereco;

public class FuncionarioDAO implements InterfaceDAO<Funcionario>{

    @Override
    public void create(Funcionario objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO funcionario (nome, fone1, fone2, email, status, endereco_id, complementoEndereco, cpf, rg, usuario, senha) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getEmail());
            pstm.setString(5, objeto.getStatus()+"");
            pstm.setInt(6, objeto.getEndereco().getId());
            pstm.setString(7, objeto.getComplementoEndereco());
            pstm.setString(8, objeto.getCpf());
            pstm.setString(9, objeto.getRg());
            pstm.setString(10, objeto.getUsuario());
            pstm.setString(11, objeto.getSenha());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
                
    }

    @Override
    public List<Funcionario> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT funcionario.id,"
        		           + "funcionario.nome,"
        		           + "funcionario.fone1,"
        		           + "funcionario.fone"
        		           + "funcionario.email"
        		           + "funcionario.endereco"
        		           + "funcionario.complementoEndereco"
        		           + "funcionario.cpf"
        		           + "funcionario.rg"
        		           + "funcionario.status"
        		           + "funcionario.usuario"
        		           + "funcionario.senha"
        		           + "FROM funcionario";
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> listaFuncionario = new ArrayList<>();
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.executeQuery();
            
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setFone1(rs.getString("fone1"));
                funcionario.setFone2(rs.getString("fone2"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setComplementoEndereco(rs.getString("complementoEndereco"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setStatus(rs.getString("status").charAt(0));
                funcionario.setUsuario(rs.getString("usuario"));
                funcionario.setSenha(rs.getString("senha"));
                
                Endereco endereco = new Endereco();
                endereco.setId(rs.getInt("id"));
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setStatus(rs.getString("status").charAt(0));
                endereco.setCep(rs.getString("cep"));
                funcionario.setEndereco(endereco);
                
                listaFuncionario.add(funcionario);
                
            }
        } catch(SQLException ex){
            ex.printStackTrace();
            
        } finally{
            ConnectionFactory.closeConnection(conexao, pstm, rs);
            return listaFuncionario;
        }
    }

    @Override
    public Funcionario retrieve(int parPK) {
    	Connection conexao = ConnectionFactory.getConnection();
    	String sqlExecutar = "SELECT funcionario.id,"
		           		   + "       funcionario.nome,"
		           		   + "       funcionario.fone1,"
		           		   + "       funcionario.fone2,"
		           		   + "		 funcionario.email,"
		           		   + "		 funcionario.complementoEndereco,"
		           		   + "		 funcionario.cpf,"
		           		   + "		 funcionario.rg,"
		           		   + "		 funcionario.status,"
		           		   + "		 funcionario.usuario,"
		           		   + "		 funcionario.senha,"
                                                                                + "		 funcionario.endereco_id"
		           		   + " FROM funcionario "      
                           //+ " 		LEFT OUTER JOIN endereco ON endereco.id = funcionario.endereco_id "
		           		   + "       funcionario.fone"
		           		   + "		 funcionario.email"
		           		   + "		 funcionario.endereco"
		           		   + "		 funcionario.complementoEndereco"
		           		   + "		 funcionario.cpf"
		           		   + "		 funcionario.rg"
		           		   + "		 funcionario.status"
		           		   + "		 funcionario.usuario"
		           		   + "		 funcionario.senha"
		           		   + "FROM funcionario"      
                           + " 		LEFT OUTER JOIN endereco ON endereco.id = funcionario.bairro_id "
                           + " WHERE funcionario.id = ? ";
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Funcionario funcionario = new Funcionario();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rs = pstm.executeQuery();
            
            while (rs.next()) {

                funcionario.setId(rs.getInt("id"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setFone1(rs.getString("fone1"));
                funcionario.setFone2(rs.getString("fone2"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setComplementoEndereco(rs.getString("complementoEndereco"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setStatus(rs.getString("status").charAt(0));
                funcionario.setUsuario(rs.getString("usuario"));
                funcionario.setSenha(rs.getString("senha"));
                
               /* Endereco endereco = new Endereco();
=======
                Endereco endereco = new Endereco();
>>>>>>> 9f10a7055a2f683a71fc92d2b22c1b88d3f8aadf
                endereco.setId(rs.getInt("id"));
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setStatus(rs.getString("status").charAt(0));
                endereco.setCep(rs.getString("cep"));
                funcionario.setEndereco(endereco);*/
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
            return funcionario;
        }
    }

    @Override
    public List<Funcionario> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT *"
                + " FROM funcionario "
                + " WHERE nome like ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Funcionario> listaBairro = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
                Funcionario bairro = new Funcionario();
                bairro.setId(rst.getInt("id"));
                bairro.setNome(rst.getString("nome"));
                bairro.setCpf(rst.getString("cpf"));
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
    public void update(Funcionario objeto) {
    	
    	Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " UPDATE funcionario"
                           + " SET "
		           		   + " funcionario.nome = ?,"
		           		   + " funcionario.fone1 = ?,"
		           		   + " funcionario.fone = ?, "
		           		   + " funcionario.email = ?, "
		           		   + " funcionario.endereco_id = ?, "
		           		   + " funcionario.complementoEndereco = ?, "
		           		   + " funcionario.cpf = ?, "
		           		   + " funcionario.rg = ?, "
		           		   + " funcionario.status = ?, "
		           		   + " funcionario.usuario = ?, "
		           		   + " funcionario.senha = ?, "
		           		   + " FROM funcionario" 
                           + " WHERE funcionario.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getEmail());
            pstm.setInt(5, objeto.getEndereco().getId());
            pstm.setString(6, objeto.getComplementoEndereco());
            pstm.setString(7, objeto.getCpf());
            pstm.setString(8, objeto.getRg());
            pstm.setString(9, objeto.getStatus()+"");
            pstm.setString(10, objeto.getUsuario());
            pstm.setString(11, objeto.getSenha());
            pstm.setInt(12, objeto.getId());
            pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Funcionario objeto) {
    	
    	Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " DELETE * "
        				   + " FROM produto p"
        				   + " WHERE p.id = ?";
        
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
