package Service;
import java.util.List;
import model.Endereco;
import DAO.EnderecoDAO;

public class EnderecoService {
    
    public static void adicionar(Endereco objeto){
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        enderecoDAO.create(objeto);
    }
    
    public static List<Endereco> carregar (){
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        return enderecoDAO.retrieve();
    }
    
   public static List<Endereco> carregar (String parseString){
        EnderecoDAO bairroDAO = new EnderecoDAO();
        return bairroDAO.retrieve(parseString);
    }
    
    public static Endereco carregar (int parPK){
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        return enderecoDAO.retrieve(parPK);
    }
    
        public static List<Endereco> carregar(String nomeParametro, String parString) {
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        return enderecoDAO.retrieve(nomeParametro, parString);
    }
    
    public static void atualizar (Endereco objeto){
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        enderecoDAO.update(objeto);
    }
    
    public static void remover (Endereco objeto){
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        enderecoDAO.delete(objeto);
    }
    
}
