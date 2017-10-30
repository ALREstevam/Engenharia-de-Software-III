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
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

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
public class GeneralDao<E extends Serializable> implements DataAccessObject<E>{
    public void insertUpdate(E elem){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        Transaction trs = null;
        
        try{
            trs = sess.beginTransaction();
            sess.saveOrUpdate(elem);
            trs.commit();
            System.err.println("["+elem.getClass()+" INSERIDO COM SUCESSO]");
        }
        catch(HibernateException e){
            if (trs!=null) trs.rollback();
            System.err.println("[ERRO AO INSERIR/ATUALIZAR "+elem.getClass()+"]");
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
            System.err.println("["+elem.getClass()+" ATUALIZADO COM SUCESSO]");
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
            System.err.println("["+elem.getClass()+" DELETADO COM SUCESSO]");
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
    public List<E> getAll(String from, String as){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        
        Query select = sess.createQuery("FROM "+from+" AS "+as+"");
        List<E> rsp = select.list();
        return rsp;
    }
    
    
    /**
     * Executar uma query
     * @param query
     * @return 
     */
    public List<E> executeQuery(String query){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        
        try{
            Query select = sess.createQuery(query);
            List<E> rsp = select.list();
            System.err.println("[CONSULTA EFETUADA COM SUCESSO]");
            return rsp;
        }catch(HibernateException e){
            e.printStackTrace();
        }
        return null;
    }
    
}
