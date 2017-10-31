package dao;

import java.util.List;
import tabacariaControllers.Database;
import model.fornecedores.Fornecedor;
import model.fornecedores.Produto;

/**
 * DAO para a classe fornecedor
 * @author andre
 */
public class FornecedorDao implements DataAccessObject<Fornecedor>{

    private final GeneralDao<Fornecedor> myDao;

    /**
     * Construtor da classe
     */
    public FornecedorDao() {
        this.myDao = new GeneralDao<>();
    }
    
    /**
     * Executar uma consulta que retorne fornecedores
     * @param query
     * @return 
     */
    @Override
    public List<Fornecedor> executeQuery(String query) {
        return myDao.executeQuery(query);
    }

    /**
     * Listar todos os fonecedores
     * @param from parâmetro nome tabela do select
     * @param as parâmetro as do select
     * @return 
     */
    @Override
    public List<Fornecedor> getAll(String from, String as) {
        return myDao.getAll(from, as);
    }

    /**
     * Deletar um fornecedor
     * @param elem fornecedor a ser deletado
     */
    @Override
    public void delete(Fornecedor elem) {
        myDao.delete(elem);
    }

    /**
     * Atualizar um fornecedor
     * @param elem fornecedor atualizado (mesmo id do antigo)
     */
    @Override
    public void update(Fornecedor elem) {
        myDao.update(elem);
    }

    /**
     * Inserir um novo fornecedor
     * @param elem novo fornecedor
     */
    @Override
    public void insert(Fornecedor elem) {
        myDao.insert(elem);
    }
    
    /**
     * Insere ou atualiza um fornecedor
     * @param elem 
     */
    @Override
    public void insertUpdate(Fornecedor elem) {
        myDao.insertUpdate(elem);
    }
    
    public List<Produto> getProductsProvidedBy(Fornecedor elem){
        ProdutoDao prodDao = new ProdutoDao();
        
        List<Produto> rsp = prodDao.executeQuery("SELECT * FROM produto WHERE ");
        
        
        return rsp;
    }
}
