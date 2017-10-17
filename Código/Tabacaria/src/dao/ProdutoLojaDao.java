package dao;

import java.util.List;
import tabacariaControllers.Database;
import model.loja.ProdutoLoja;

public class ProdutoLojaDao implements DataAccessObject<ProdutoLoja>{

    private final GeneralDao<ProdutoLoja> myDao;

    public ProdutoLojaDao() {
        this.myDao = new GeneralDao<>();
    }
    
    @Override
    public List<ProdutoLoja> executeQuery(String query) {
        return myDao.executeQuery(query);
    }

    @Override
    public List<ProdutoLoja> getAll(String from, String as) {
        return myDao.getAll(from, as);
    }

    @Override
    public void delete(ProdutoLoja elem) {
        myDao.delete(elem);
    }

    @Override
    public void update(ProdutoLoja elem) {
        myDao.update(elem);
    }

    @Override
    public void insert(ProdutoLoja elem) {
        myDao.insert(elem);
    }
    

    @Override
    public void insertUpdate(ProdutoLoja elem) {
        myDao.insertUpdate(elem);
    }
}
