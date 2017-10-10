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
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author andre
 */
public class generalDao<E> {
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
    
    public void insert(E elem){
        insertUpdate(elem);
    }
    
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
    public List<E> getAll(String from, String as){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        
        Query select = sess.createQuery("FROM "+from+" AS "+as+"");
        List<E> rsp = select.list();
        return rsp;
    }
    
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
