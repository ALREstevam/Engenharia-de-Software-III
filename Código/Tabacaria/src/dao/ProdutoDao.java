package dao;

import java.util.List;
import model.fornecedores.Produto;

public class ProdutoDao extends GeneralDao<Produto> implements DataAccessObject<Produto>{

    private final GeneralDao<Produto> myDao;

    public ProdutoDao() {
        this.myDao = new GeneralDao<>();
    }
    
    @Override
    public List<Produto> executeQuery(String query) {
        return myDao.executeQuery(query);
    }

    @Override
    public List<Produto> getAll(String from, String as) {
        return myDao.getAll(from, as);
    }

    @Override
    public void delete(Produto elem) {
        myDao.delete(elem);
    }

    @Override
    public void update(Produto elem) {
        myDao.update(elem);
    }

    @Override
    public void insert(Produto elem) {
        myDao.insert(elem);
    }
    

    @Override
    public void insertUpdate(Produto elem) {
        myDao.insertUpdate(elem);
    }
}
