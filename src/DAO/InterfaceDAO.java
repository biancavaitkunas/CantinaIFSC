package DAO;

import java.util.List;

public interface InterfaceDAO <T>{
    
    public void create(T objeto);
    public abstract List<T> retrieve();
    public abstract T retrieve (int parRk);
    public abstract T retrieve (String parString);
    public abstract void update (T objeto);
    public abstract void delete(T objeto);
    
}
