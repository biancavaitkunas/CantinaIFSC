package Service;
import java.util.List;
import model.Compra;
import DAO.CompraDAO;

public class CompraService {
    
    public static void adicionar(Compra objeto){
        CompraDAO produtoDAO = new CompraDAO();
        produtoDAO.create(objeto);
    }
    
    public static List<Compra> carregar (){
        CompraDAO funcionarioDAO = new CompraDAO();
        return funcionarioDAO.retrieve();
    }
    
   public static List<Compra> carregar (String parseString){
        CompraDAO funcionarioDAO = new CompraDAO();
        return funcionarioDAO.retrieve(parseString);
    }
    
    public static Compra carregar (int parPK){
        CompraDAO funcionarioDAO = new CompraDAO();
        return funcionarioDAO.retrieve(parPK);
    }
    
    public static void atualizar (Compra objeto){
        CompraDAO funcionarioDAO = new CompraDAO();
        funcionarioDAO.update(objeto);
    }
    
    public static void remover (Compra objeto){
        CompraDAO funcionarioDAO = new CompraDAO();
        funcionarioDAO.delete(objeto);
    }
    
}
