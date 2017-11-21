/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import view.comboboxModel.Descriptible;
import view.tableModel.Arrayable;

/**
 *
 * @author andre
 */

/**
 * Define uma interface para um CRUD geral
 * @author andre
 * @param <E> 
 */
public interface DataAccessObject<E extends Serializable & Descriptible & Arrayable> {
    public List<E> executeQuery(String query);
    public List<E> getAll(String from, String as);
    public void delete(E elem);
    public void update(E elem);
    public void insert(E elem);
    public void insertUpdate(E elem);
}
