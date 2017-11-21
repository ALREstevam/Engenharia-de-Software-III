/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import hibernate.HibernateUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import model.pessoa.*;
import model.notasFiscais.*;
import model.fornecedores.*;
import model.loja.*;
import view.comboboxModel.Descriptible;
import view.tableModel.Arrayable;

/**
 *
 * @author andre
 */
/**
 * Classe GeneralDao uma classe que usa o hibernate para implementar a interface de
 * CRUD para um tipo de objeto qualquer
 * @author andre
 * @param <E> tipo do objeto a ser persistido pelo DAO
 */
public class GeneralDao<E extends Serializable & Descriptible & Arrayable> implements DataAccessObject<E>{
    
   public final Map<Class, String> tableNames;

    public GeneralDao() {
        this.tableNames = new HashMap<>();
        this.tableNames.put(FornecedorDao.class, "fornecedor");
        this.tableNames.put(Funcionario.class, "funcionario");
        this.tableNames.put(Gerente.class, "funcionario");
        this.tableNames.put(Caixa.class, "funcionario");
        this.tableNames.put(Entregador.class, "funcionario");
        this.tableNames.put(NotaFiscal.class, "notafiscal");
        this.tableNames.put(NotaFiscalCompra.class, "notafiscal");
        this.tableNames.put(NotaFiscalVenda.class, "notafiscal");
        this.tableNames.put(Produto.class, "produto");
        this.tableNames.put(ProdutoPerecivel.class, "produto");
        this.tableNames.put(ProdutoLoja.class, "produtoloja");
        this.tableNames.put(Venda.class, "venda");
    }
    
    /**
     * Retorna o nome da tabela no banco com base na classe do objeto
     * 
     * Object o = ...;
     * o.getClass();
     * 
     * @param classOfObject
     * @return 
     */
    public String getTableName(Class classOfObject){
        return this.tableNames.get(classOfObject);
    }
    /**
     * 
     * @param elem 
     */
   @Override
    public void insertUpdate(E elem){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        Transaction trs = null;
        
        try{
            trs = sess.beginTransaction();
            sess.saveOrUpdate(elem);
            trs.commit();
            System.err.println("\t**["+elem.getClass()+" INSERIDO COM SUCESSO]");
        }
        catch(HibernateException e){
            if (trs!=null) trs.rollback();
            System.err.println("\t**[ERRO AO INSERIR/ATUALIZAR "+elem.getClass()+"]");
            e.printStackTrace();
        }
        finally{
            sess.flush();
            sess.close();
        }
    }
    
    /**
     * Inserir elemento
     * @param elem 
     */
    public void insert(E elem){
        insertUpdate(elem);
    }
    
    /**
     * Atualizar elemento
     * @param elem 
     */
    public void update(E elem){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        Transaction trs = null;
        
        try{
            trs = sess.beginTransaction();
            sess.update(elem);
            trs.commit();
            System.err.println("\t**["+elem.getClass()+" ATUALIZADO COM SUCESSO]");
        }
        catch(HibernateException e){
            if (trs!=null) trs.rollback();
            e.printStackTrace();
        }
        finally{
            sess.flush();
            sess.close();
        }
    }
    
    /**
     * Deletar elemento
     * @param elem 
     */
    public void delete(E elem){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        Transaction trs = null;
        
        try{
            trs = sess.beginTransaction();
            sess.delete(elem);
            trs.commit();
            System.err.println("\t**["+elem.getClass()+" DELETADO COM SUCESSO]");
        }
        catch(HibernateException e){
            if (trs!=null) trs.rollback();
            e.printStackTrace();
        }
        finally{
            sess.flush();
            sess.close();
        }
    }
    
    /*TODO: updt to any name*/
    /**
     * Select geral que retorne linhas da tabela mapeáveis para o tipo E
     * @param from
     * @param as
     * @return 
     */
    public List<E> getAll(String from, Class clss){
        return this.getAll(from, this.getTableName(clss));
    }
    /**
     * 
     * @param from
     * @param as
     * @return 
     */
   @Override
    public List<E> getAll(String from, String as){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        String querytxt = (as.equals("")) ? "FROM " + from : "FROM " + from + " AS " + as;
        System.err.println("[EXECUTANDO QUERY: `"+querytxt+"`]");
        Query select = sess.createQuery(querytxt);
        List<E> rsp = select.list();
        return rsp;
    }
    
    /**
     * Executar uma query
     * @param query
     * @return 
     */
   @Override
    public List<E> executeQuery(String query){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        
        try{
            Query select = sess.createQuery(query);
            List<E> rsp = select.list();
            System.err.println("\t**[CONSULTA EFETUADA COM SUCESSO]");
            return rsp;
        }catch(HibernateException e){
        }
        return null;
    }
    
}
