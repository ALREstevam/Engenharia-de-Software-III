package dao;

import java.util.List;
import tabacariaControllers.Database;
import model.loja.Venda;

public class VendaDao extends GeneralDao<Venda> implements DataAccessObject<Venda>{

    private final GeneralDao<Venda> myDao;

    public VendaDao() {
        this.myDao = new GeneralDao<>();
    }
    
    @Override
    public List<Venda> executeQuery(String query) {
        return myDao.executeQuery(query);
    }

    @Override
    public List<Venda> getAll(String from, String as) {
        return myDao.getAll(from, as);
    }

    @Override
    public void delete(Venda elem) {
        myDao.delete(elem);
    }

    @Override
    public void update(Venda elem) {
        myDao.update(elem);
    }

    @Override
    public void insert(Venda elem) {
        myDao.insert(elem);
    }
    

    @Override
    public void insertUpdate(Venda elem) {
        myDao.insertUpdate(elem);
    }
}
