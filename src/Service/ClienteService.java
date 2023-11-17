package Service;
import java.util.List;
import model.Cliente;
import DAO.ClienteDAO;

public class ClienteService {
    
    public static void adicionar(Cliente objeto){
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.create(objeto);
    }
    
    public static List<Cliente> carregar (){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.retrieve();
    }
    
   public static List<Cliente> carregar (String parseString){
        ClienteDAO bairroDAO = new ClienteDAO();
        return bairroDAO.retrieve(parseString);
    }
    
    public static Cliente carregar (int parPK){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.retrieve(parPK);
    }
    
    public static List<Cliente> carregar(String nomeParametro, String parString) {
        ClienteDAO enderecoDAO = new ClienteDAO();
        return enderecoDAO.retrieve(nomeParametro, parString);
    }
    
    public static void atualizar (Cliente objeto){
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.update(objeto);
    }
    
    public static void remover (Cliente objeto){
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.delete(objeto);
    }
    
}
