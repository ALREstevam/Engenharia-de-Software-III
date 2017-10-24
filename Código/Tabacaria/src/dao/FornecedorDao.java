package dao;

import java.util.List;
import tabacariaControllers.Database;
import model.fornecedores.Fornecedor;

public class FornecedorDao implements DataAccessObject<Fornecedor>{

    private final GeneralDao<Fornecedor> myDao;

    public FornecedorDao() {
        this.myDao = new GeneralDao<>();
    }
    
    @Override
    public List<Fornecedor> executeQuery(String query) {
        return myDao.executeQuery(query);
    }

    @Override
    public List<Fornecedor> getAll(String from, String as) {
        return myDao.getAll(from, as);
    }

    @Override
    public void delete(Fornecedor elem) {
        myDao.delete(elem);
    }

    @Override
    public void update(Fornecedor elem) {
        myDao.update(elem);
    }

    @Override
    public void insert(Fornecedor elem) {
        myDao.insert(elem);
    }
    

    @Override
    public void insertUpdate(Fornecedor elem) {
        myDao.insertUpdate(elem);
    }
}
