package Service;
import java.util.List;
import model.ItemVenda;
import DAO.ItemVendaDAO;

public class ItemVendaService {
    
    public static void adicionar(ItemVenda objeto){
        ItemVendaDAO clienteDAO = new ItemVendaDAO();
        clienteDAO.create(objeto);
    }
    
    public static List<ItemVenda> carregar (){
        ItemVendaDAO clienteDAO = new ItemVendaDAO();
        return clienteDAO.retrieve();
    }
    
   public static List<ItemVenda> carregar (String parseString){
        ItemVendaDAO bairroDAO = new ItemVendaDAO();
        return bairroDAO.retrieve(parseString);
    }
    
    public static ItemVenda carregar (int parPK){
        ItemVendaDAO clienteDAO = new ItemVendaDAO();
        return clienteDAO.retrieve(parPK);
    }
    
    public static List<ItemVenda> carregar(String nomeParametro, String parString) {
        ItemVendaDAO enderecoDAO = new ItemVendaDAO();
        return enderecoDAO.retrieve(nomeParametro, parString);
    }
    
    public static void atualizar (ItemVenda objeto){
        ItemVendaDAO clienteDAO = new ItemVendaDAO();
        clienteDAO.update(objeto);
    }
    
    public static void remover (ItemVenda objeto){
        ItemVendaDAO clienteDAO = new ItemVendaDAO();
        clienteDAO.delete(objeto);
    }
    
}
