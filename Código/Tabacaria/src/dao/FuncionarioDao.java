package dao;

import java.util.List;
import tabacariaControllers.Database;
import model.pessoa.Funcionario;

public class FuncionarioDao extends GeneralDao<Funcionario> implements DataAccessObject<Funcionario>{

    private final GeneralDao<Funcionario> myDao;

    public FuncionarioDao() {
        this.myDao = new GeneralDao<>();
    }
    
    @Override
    public List<Funcionario> executeQuery(String query) {
        return myDao.executeQuery(query);
    }

    @Override
    public List<Funcionario> getAll(String from, String as) {
        return myDao.getAll(from, as);
    }

    @Override
    public void delete(Funcionario elem) {
        myDao.delete(elem);
    }

    @Override
    public void update(Funcionario elem) {
        myDao.update(elem);
    }

    @Override
    public void insert(Funcionario elem) {
        myDao.insert(elem);
    }
    

    @Override
    public void insertUpdate(Funcionario elem) {
        myDao.insertUpdate(elem);
    }
}
