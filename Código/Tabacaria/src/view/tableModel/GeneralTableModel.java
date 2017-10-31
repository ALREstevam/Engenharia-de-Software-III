/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author andre
 */
public class GeneralTableModel<E extends ParametersAsArray> extends AbstractTableModel{
    private final String[] colunas;
    private final List<E> lst;

    public GeneralTableModel(String[] colunas, List<E> lst) {
        this.colunas = colunas;
        this.lst = lst;
    }
    
    @Override
    public int getRowCount() {
        return lst.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        E elem = this.lst.get(rowIndex);
        return elem.argumentsToArray()[columnIndex];
    }

   
}
