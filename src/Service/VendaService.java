package Service;
import java.util.List;
import model.Venda;
import DAO.VendaDAO;

public class VendaService {
    
    public static void adicionar(Venda objeto){
        VendaDAO produtoDAO = new VendaDAO();
        produtoDAO.create(objeto);
    }
    
    public static List<Venda> carregar (){
        VendaDAO funcionarioDAO = new VendaDAO();
        return funcionarioDAO.retrieve();
    }
    
   public static List<Venda> carregar (String parseString){
        VendaDAO funcionarioDAO = new VendaDAO();
        return funcionarioDAO.retrieve(parseString);
    }
    
    public static Venda carregar (int parPK){
        VendaDAO funcionarioDAO = new VendaDAO();
        return funcionarioDAO.retrieve(parPK);
    }
    
    public static void atualizar (Venda objeto){
        VendaDAO funcionarioDAO = new VendaDAO();
        funcionarioDAO.update(objeto);
    }
    
    public static void remover (Venda objeto){
        VendaDAO funcionarioDAO = new VendaDAO();
        funcionarioDAO.delete(objeto);
    }
    
    public static int getMaiorId (){
        VendaDAO vendaDAO = new VendaDAO();
        return vendaDAO.getMaiorId();
    }
    
}
