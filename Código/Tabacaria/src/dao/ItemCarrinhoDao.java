package dao;

import java.util.List;
import model.loja.ItemCarrinho;

public class ItemCarrinhoDao extends GeneralDao<ItemCarrinho> implements DataAccessObject<ItemCarrinho>{

    private final GeneralDao<ItemCarrinho> myDao;

    public ItemCarrinhoDao() {
        this.myDao = new GeneralDao<>();
    }
    
    @Override
    public List<ItemCarrinho> executeQuery(String query) {
        return myDao.executeQuery(query);
    }

    @Override
    public List<ItemCarrinho> getAll(String from, String as) {
        return myDao.getAll(from, as);
    }

    @Override
    public void delete(ItemCarrinho elem) {
        myDao.delete(elem);
    }

    @Override
    public void update(ItemCarrinho elem) {
        myDao.update(elem);
    }

    @Override
    public void insert(ItemCarrinho elem) {
        myDao.insert(elem);
    }
    

    @Override
    public void insertUpdate(ItemCarrinho elem) {
        myDao.insertUpdate(elem);
    }
}
