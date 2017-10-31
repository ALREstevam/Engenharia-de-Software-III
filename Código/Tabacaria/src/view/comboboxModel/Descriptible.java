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
public interface Descriptible {
    public String getDefaultDescription(String separator);
    public String getShortDescription(String separator);
    public String getMediumdesCription(String separator);
    public String getLargeDescription(String separator);
}
