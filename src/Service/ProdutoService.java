package Service;
import java.util.List;
import model.Produto;
import DAO.ProdutoDAO;

public class ProdutoService {
    
    public static void adicionar(Produto objeto){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.create(objeto);
    }
    
    public static List<Produto> carregar (){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.retrieve();
    }
    
   public static List<Produto> carregar (String parseString){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.retrieve(parseString);
    }
    
    public static Produto carregar (int parPK){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.retrieve(parPK);
    }
    
    public static void atualizar (Produto objeto){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.update(objeto);
    }
    
    public static void remover (Produto objeto){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.delete(objeto);
    }
    
}
