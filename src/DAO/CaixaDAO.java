package DAO;

import java.util.List;
import model.Caixa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cidade;
import model.Funcionario;

public class CaixaDAO implements InterfaceDAO<Caixa>{

    @Override
    public void create(Caixa objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO caixa (dataHoraAbertura, dataHoraFechamento, valorAbertura, valorFechamento, observacao, status, funcionario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDataHoraAbertura());
            pstm.setString(2, objeto.getDataHoraFechamento());
            pstm.setString(3, String.valueOf(objeto.getValorAbertura()));
            pstm.setString(4, String.valueOf(objeto.getValorFechamento()));
            pstm.setString(5, String.valueOf(objeto.getObservacao()));
            pstm.setString(6, String.valueOf(objeto.getStatus()));
            pstm.setString(7, String.valueOf(objeto.getFuncionario()));
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
                
    }

    @Override
    public List<Caixa> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT caixa.id,"
                            + "caixa.dataHoraAbertura, "
                            + "caixa.dataHoraFechamento, "
                            + "caixa.valorAbertura, "
                            + "caixa.valorFechamento, "
                            + "caixa.observacao, "
                            + "caixa.funcionario, "
                            + "caixa.status, "
                            + "FROM caixa ";
        
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
    public Caixa retrieve(int parRk) {
        return null;
    }

    @Override
    public List<Caixa> retrieve(String parString) {
        return null;
    }
    
    public List<Caixa> retrieve(String nomeParametro, String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT caixa.id,"
                            + "caixa.dataHoraAbertura, "
                            + "caixa.dataHoraFechamento, "
                            + "caixa.valorAbertura, "
                            + "caixa.valorFechamento, "
                            + "caixa.observacao, "
                            + "caixa.funcionario, "
                            + "caixa.status, "
                            + "FROM caixa "
                            + " WHERE " + nomeParametro + " like ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Caixa> listaCaixa = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            while (rst.next()) {
                Caixa caixa = new Caixa();

                caixa.setId(rst.getInt("id"));
                caixa.setDataHoraAbertura(rst.getString("dataHoraAbertura"));
                caixa.setDataHoraFechamento(rst.getString("dataHoraFechamento"));
                caixa.setValorAbertura(rst.getFloat("valorAbertura"));
                caixa.setValorFechamento(rst.getFloat("valorFechamento"));
                caixa.setObservacao(rst.getString("observacao"));
                caixa.setDataHoraFechamento(rst.getString("dataHoraFechamento"));
                
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rst.getInt("id"));
                funcionario.setCpf(rst.getString("cpf"));
                funcionario.setComplementoEndereco(rst.getString("complementoEndereco"));
                funcionario.setEmail(rst.getString("email"));
                funcionario.setFone1(rst.getString("fone1"));
                funcionario.setEmail(rst.getString("email"));
                funcionario.setFone2(rst.getString("fone2"));
                funcionario.setNome(rst.getString("nome"));
                funcionario.setRg(rst.getString("rg"));
                funcionario.setSenha(rst.getString("senha"));
                funcionario.setStatus(rst.getString("status").charAt(0));
                caixa.setFuncionario(funcionario);

                listaCaixa.add(caixa);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCaixa;
        }
    }

    @Override
    public void update(Caixa objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " UPDATE caixa"
                           + " SET "
                           + "caixa.dataHoraAbertura = ?, "
                           + "caixa.dataHoraFechamento = ?, "
                           + "caixa.valorAbertura = ?, "
                           + "caixa.valorFechamento = ?, "
                           + "caixa.observacao = ?, "
                           + "caixa.funcionario = ?, "
                           + "caixa.status = ?, "
                           + " WHERE caixa.id = ?";
        
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDataHoraAbertura());
            pstm.setString(2, objeto.getDataHoraFechamento());
            pstm.setString(3, String.valueOf(objeto.getValorAbertura()));
            pstm.setString(4, String.valueOf(objeto.getValorFechamento()));
            pstm.setString(5, String.valueOf(objeto.getObservacao()));
            pstm.setString(6, String.valueOf(objeto.getStatus()));
            pstm.setString(7, String.valueOf(objeto.getFuncionario()));
            pstm.setInt(8, objeto.getId());
            pstm.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Caixa objeto) {
    }

}
