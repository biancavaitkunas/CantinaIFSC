package Service;

import java.util.List;
import DAO.CidadeDAO;
import model.Cidade;

public class CidadeService {
        public static void adicionar(Cidade objeto) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.create(objeto);
    }

    public static List<Cidade> carregar() {
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve();
    }

    public static Cidade carregar (int parPK) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve(parPK);
    }

    public static List<Cidade> carregar(String nomeParametro, String parString) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve(nomeParametro,parString);
    }

    public static void atualizar(Cidade objeto) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.update(objeto);
    }

    public static void remover(Cidade objeto) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.delete(objeto);
    }
}
