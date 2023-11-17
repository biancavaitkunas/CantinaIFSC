package Service;
import java.util.List;
import model.Cliente;
import DAO.ClienteDAO;

public class CienteService {
    
    public static void adicionar(Cliente objeto){
        ClienteDAO produtoDAO = new ClienteDAO();
        produtoDAO.create(objeto);
    }
    
    public static List<Cliente> carregar (){
        ClienteDAO funcionarioDAO = new ClienteDAO();
        return funcionarioDAO.retrieve();
    }
    
   public static List<Cliente> carregar (String parseString){
        ClienteDAO funcionarioDAO = new ClienteDAO();
        return funcionarioDAO.retrieve(parseString);
    }
    
    public static Cliente carregar (int parPK){
        ClienteDAO funcionarioDAO = new ClienteDAO();
        return funcionarioDAO.retrieve(parPK);
    }
    
    public static void atualizar (Cliente objeto){
        ClienteDAO funcionarioDAO = new ClienteDAO();
        funcionarioDAO.update(objeto);
    }
    
    public static void remover (Cliente objeto){
        ClienteDAO funcionarioDAO = new ClienteDAO();
        funcionarioDAO.delete(objeto);
    }
    
}
