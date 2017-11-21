package dao;

import java.util.List;
import model.notasFiscais.NotaFiscal;

public class NotaFiscalDao extends GeneralDao<NotaFiscal> implements DataAccessObject<NotaFiscal>{

    private final GeneralDao<NotaFiscal> myDao;

    public NotaFiscalDao() {
        this.myDao = new GeneralDao<>();
    }
    
    @Override
    public List<NotaFiscal> executeQuery(String query) {
        return myDao.executeQuery(query);
    }

    @Override
    public List<NotaFiscal> getAll(String from, String as) {
        return myDao.getAll(from, as);
    }

    @Override
    public void delete(NotaFiscal elem) {
        myDao.delete(elem);
    }

    @Override
    public void update(NotaFiscal elem) {
        myDao.update(elem);
    }

    @Override
    public void insert(NotaFiscal elem) {
        myDao.insert(elem);
    }
    

    @Override
    public void insertUpdate(NotaFiscal elem) {
        myDao.insertUpdate(elem);
    }
}
