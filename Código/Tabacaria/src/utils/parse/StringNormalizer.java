/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.parse;

import java.text.Normalizer;

/**
 *
 * @author andre
 */
public class StringNormalizer {
    /**
     * 
     * @param input
     * @return 
     */
    public static String toNormalForm(String input){
        return Normalizer.normalize(input, Normalizer.Form.NFD).toUpperCase().replaceAll("[^\\p{ASCII}]", "");
    }
    
    public static String toNormalForm2(String input){
        return input.toUpperCase().replaceAll("[^a-zA-Z0-9]", "");
    }
}
