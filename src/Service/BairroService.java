package Service;
import java.util.List;
import model.Bairro;
import DAO.BairroDAO;

public class BairroService {
    
    public static void adicionar(Bairro objeto){
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.create(objeto);
    }
    
    public static List<Bairro> carregar (){
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve();
    }
    
   public static List<Bairro> carregar (String parseString){
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve(parseString);
    }
    
    public static Bairro carregar (int parPK){
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve(parPK);
    }
    
    public static void atualizar (Bairro objeto){
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.update(objeto);
    }
    
    public static void remover (Bairro objeto){
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.delete(objeto);
    }
    
}
