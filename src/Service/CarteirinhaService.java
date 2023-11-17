package Service;
import java.util.List;
import model.Carteirinha;
import DAO.CarteirinhaDAO;

public class CarteirinhaService {
    
    public static void adicionar(Carteirinha objeto){
        CarteirinhaDAO bairroDAO = new CarteirinhaDAO();
        bairroDAO.create(objeto);
    }
    
    public static List<Carteirinha> carregar (){
        CarteirinhaDAO bairroDAO = new CarteirinhaDAO();
        return bairroDAO.retrieve();
    }
    
    public static List<Carteirinha> carregar (String parseString){
        CarteirinhaDAO bairroDAO = new CarteirinhaDAO();
        return bairroDAO.retrieve(parseString);
    }
    
    public static Carteirinha carregar (int parPK){
        CarteirinhaDAO bairroDAO = new CarteirinhaDAO();
        return bairroDAO.retrieve(parPK);
    }
    
    public static void atualizar (Carteirinha objeto){
        CarteirinhaDAO bairroDAO = new CarteirinhaDAO();
        bairroDAO.update(objeto);
    }
    
    public static void remover (Carteirinha objeto){
        CarteirinhaDAO bairroDAO = new CarteirinhaDAO();
        bairroDAO.delete(objeto);
    }
    
}
