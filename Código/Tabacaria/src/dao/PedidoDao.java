package dao;

import java.util.List;
import model.loja.Pedido;
import model.loja.Venda;

public class PedidoDao extends GeneralDao<Pedido> implements DataAccessObject<Pedido>{

    private final GeneralDao<Pedido> myDao;

    public PedidoDao() {
        this.myDao = new GeneralDao<>();
    }
    
    @Override
    public List<Pedido> executeQuery(String query) {
        return myDao.executeQuery(query);
    }

    @Override
    public List<Pedido> getAll(String from, String as) {
        return myDao.getAll(from, as);
    }

    @Override
    public void delete(Pedido elem) {
        myDao.delete(elem);
    }

    @Override
    public void update(Pedido elem) {
        myDao.update(elem);
    }

    @Override
    public void insert(Pedido elem) {
        myDao.insert(elem);
    }
    

    @Override
    public void insertUpdate(Pedido elem) {
        myDao.insertUpdate(elem);
    }
}
