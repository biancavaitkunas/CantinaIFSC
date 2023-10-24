package Service;
import java.util.List;
import model.Bairro;
import DAO.BairroDAO;

public class BairroService {
    
    public static void adicionar(Bairro objeto){
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.Creat(objeto);
        
    }
    
    public static List<Bairro> carregar (){
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.Retrieve();
        
    }
    
    public static Bairro carregar (String parseString){
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.Retrieve(parseString);
        
    }
    
    public static Bairro carregar (int parPK){
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.Retrieve(parPK);
        
    }
    
    public static void atualizar (Bairro objeto){
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.Update(objeto);
        
    }
    
    public static void remover (Bairro objeto){
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.Delete(objeto);
        
    }
    
}
