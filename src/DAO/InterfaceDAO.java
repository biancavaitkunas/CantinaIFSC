package DAO;

import java.util.List;

public interface InterfaceDAO <T>{
    
    public void Creat(T objeto);
    public abstract List<T> Retrieve();
    public abstract T Retrieve (int parRk);
    public abstract T Retrieve (String parString);
    public abstract void Update (T objeto);
    public abstract void Delete(T objeto);
    
}
