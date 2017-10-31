/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.comboboxModel;

/**
 *
 * @author andre
 */
public class DesciptableDec<E> implements Descriptible{

    private E smp;
    public DesciptableDec(E sample) {
        this.smp = sample;
    }

    @Override
    public String getDefaultDescription(String separator) {
        return smp.toString();
    }

    @Override
    public String getShortDescription(String separator) {
         return smp.toString();
    }

    @Override
    public String getMediumdesCription(String separator) {
         return smp.toString();
    }

    @Override
    public String getLargeDescription(String separator) {
         return smp.toString();
    }
    
}
