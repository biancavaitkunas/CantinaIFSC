package Service;
import java.util.List;
import model.Fornecedor;
import DAO.FornecedorDAO;

public class FornecedorService {
    
    public static void adicionar(Fornecedor objeto){
        FornecedorDAO produtoDAO = new FornecedorDAO();
        produtoDAO.create(objeto);
    }
    
    public static List<Fornecedor> carregar (){
        FornecedorDAO funcionarioDAO = new FornecedorDAO();
        return funcionarioDAO.retrieve();
    }
    
   public static List<Fornecedor> carregar (String parseString){
        FornecedorDAO funcionarioDAO = new FornecedorDAO();
        return funcionarioDAO.retrieve(parseString);
    }
    
    public static Fornecedor carregar (int parPK){
        FornecedorDAO funcionarioDAO = new FornecedorDAO();
        return funcionarioDAO.retrieve(parPK);
    }
    
    public static void atualizar (Fornecedor objeto){
        FornecedorDAO funcionarioDAO = new FornecedorDAO();
        funcionarioDAO.update(objeto);
    }
    
    public static void remover (Fornecedor objeto){
        FornecedorDAO funcionarioDAO = new FornecedorDAO();
        funcionarioDAO.delete(objeto);
    }
    
}
