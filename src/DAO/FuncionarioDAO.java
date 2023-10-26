package DAO;

import java.util.List;
import model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Bairro;

public class FuncionarioDAO implements InterfaceDAO<Funcionario>{

    @Override
    public void create(Funcionario objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO funcionario (cpf, rg, usuario, senha) VALUES (?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCpf());
            pstm.setString(2, objeto.getRg());
            pstm.setString(3, objeto.getUsuario());
            pstm.setString(3, objeto.getSenha());
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
        String sqlExecutar = "SELECT funcionario.id, funcionario.descricao FROM funcionario";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> listaFuncionario = new ArrayList<>();
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.executeQuery();
            
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setRg(rs.getString("descricao"));
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
    public Funcionario retrieve(int parRk) {
        return null;
    }

    @Override
    public Funcionario retrieve(String parString) {
        return null;
    }

    @Override
    public void update(Funcionario objeto) {
    }

    @Override
    public void delete(Funcionario objeto) {
    }

}
