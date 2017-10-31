/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.comboboxModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author andre
 */
public class GeneralComboBoxModel<E extends Descriptible> {
    
    private enum DESCRIPTION_TYPES {default_size, short_size, medium_size, large_size};
    
    public DefaultComboBoxModel getComboBoxModelUsingToString(List<E> elemList){
        List<String> elemInfo = new ArrayList<>(elemList.size());
        
        for(E element : elemList){
            elemInfo.add(element.toString());
        }
        return new DefaultComboBoxModel(elemInfo.toArray());
    }
    
    public DefaultComboBoxModel getComboBoxModelUsingShortDescripton(List<E> elemList, String separator){
        return this.getComboBoxModel(elemList, separator, DESCRIPTION_TYPES.short_size);
    }
    
    public DefaultComboBoxModel getComboBoxModelUsingMediumDescripton(List<E> elemList, String separator){
        return this.getComboBoxModel(elemList, separator, DESCRIPTION_TYPES.medium_size);
    }
    
    public DefaultComboBoxModel getComboBoxModelUsingLargeDescripton(List<E> elemList, String separator){
        return this.getComboBoxModel(elemList, separator, DESCRIPTION_TYPES.large_size);
    }
    
    public DefaultComboBoxModel getComboBoxModelUsingDefaultDescripton(List<E> elemList, String separator){
        return this.getComboBoxModel(elemList, separator, DESCRIPTION_TYPES.default_size);
    }
    
    private DefaultComboBoxModel getComboBoxModel(List<E> elemList, String separator, DESCRIPTION_TYPES desc){
        List<String> elemInfo = new ArrayList<>(elemList.size());
        for(E element : elemList){
            String strElemDescription = "";
            switch(desc){
                case default_size:
                    strElemDescription = element.getDefaultDescription(separator);
                    break;
                case large_size:
                    strElemDescription = element.getLargeDescription(separator);
                    break;
                case medium_size:
                    strElemDescription = element.getMediumdesCription(separator);
                    break;
                case short_size:
                    strElemDescription = element.getShortDescription(separator);
                    break;
            }
            elemInfo.add(strElemDescription);
        }
        return new DefaultComboBoxModel(elemInfo.toArray());
    }
}
