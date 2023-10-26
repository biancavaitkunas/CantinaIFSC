package DAO;

import java.util.List;
import model.Endereco;
import model.Bairro;
import model.Cidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EnderecoDAO implements InterfaceDAO<Endereco>{

    @Override
    public void create(Endereco objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cidade (cep, logradouro, status, bairro, cidade) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCep());
            pstm.setString(2, objeto.getLogradouro());
            pstm.setString(3, String.valueOf(objeto.getStatus()));
            pstm.setString(4, String.valueOf(objeto.getBairro()));
            pstm.setString(5, String.valueOf(objeto.getCidade()));
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
                
    }

    @Override
    public List<Endereco> retrieve() {
        return null;
    }

    @Override
    public Endereco retrieve(int parRk) {
        return null;
    }
    
    @Override
    public Endereco retrieve(String parString) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public List<Endereco> retrieve(String nomeParametro, String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT endereco.id, "
                           + "endereco.cep, "
                           + "endereco.logradouro, "
                           + "endereco.cidade_id, "
                           + "endereco.bairro_id, "
                           + "endereco.status, "
                           + "bairro.descricao , "
                           + "cidade.descricao , "
                           + "cidade.uf "                
                           + "FROM endereco "
                           + " LEFT OUTER JOIN BAIRRO ON BAIRRO.id = ENDERECO.bairro_id "
                           + " LEFT OUTER JOIN CIDADE ON CIDADE.id = ENDERECO.Cidade_id "
                           + " WHERE " + nomeParametro + " like ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Endereco> listaEndereco = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
                Endereco endereco = new Endereco();

                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("logradouro"));
                endereco.setStatus(rst.getString("status").charAt(0));
                //Utilizei o String.CharAt(0) para transformar a 
                //String de retorno em char
                endereco.setCep(rst.getString("cep"));

                Bairro bairro = new Bairro();
                bairro.setId(rst.getInt("Bairro_id"));
                bairro.setDescricao(rst.getString("bairro.descricao"));
                endereco.setBairro(bairro);

                Cidade cidade = new Cidade();
                cidade.setId(rst.getInt("Cidade_id"));
                cidade.setDescricao(rst.getString("cidade.descricao"));
                cidade.setUf(rst.getString("uf"));
                endereco.setCidade(cidade);

                listaEndereco.add(endereco);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaEndereco;
        }
    }

    @Override
    public void update(Endereco objeto) {
    }

    @Override
    public void delete(Endereco objeto) {
    }
    
}
