package Service;
import java.util.List;
import model.Funcionario;
import DAO.FuncionarioDAO;

public class FuncionarioService {
    
    public static void adicionar(Funcionario objeto){
        FuncionarioDAO produtoDAO = new FuncionarioDAO();
        produtoDAO.create(objeto);
    }
    
    public static List<Funcionario> carregar (){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.retrieve();
    }
    
   public static List<Funcionario> carregar (String parseString){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.retrieve(parseString);
    }
    
    public static Funcionario carregar (int parPK){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.retrieve(parPK);
    }
    
    public static void atualizar (Funcionario objeto){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.update(objeto);
    }
    
    public static void remover (Funcionario objeto){
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.delete(objeto);
    }
    
}
