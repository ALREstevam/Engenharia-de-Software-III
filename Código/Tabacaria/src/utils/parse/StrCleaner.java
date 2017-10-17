/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.parse;
/**
 * Helps to format a String to be parsed as a Number
 * @author andre
 */
public class StrCleaner{
    
    /**
     * Remove all non number characters except '.', ',' and '-'
     * @param str a string representing a number
     * @return a clean String
     */
    public String removeNonNumberChars(String str){
        return str.replaceAll("[^0-9.,-]", "");
    }
    
    /**
     * Replaces all commas in a string with dots
     * @param str
     * @return 
     */
    public String commaToDot(String str){
        return str.replaceAll(",", ".");
    }
    
    /**
     * Removes all dots from a string
     * @param str
     * @return 
     */
    public String removeDots(String str){
        return str.replaceAll(".", "");
    }
    
    /**
     * Removes all commas from a string
     * @param str
     * @return 
     */
    public String removeCommas(String str){
        return str.replaceAll(",", "");
    }
    
    /**
     * Uses a default configuration to clean a String
     * @param str
     * @return a cleaned String in the format -123.56
     */
    public String stdCleanner(String str){
        int dots = str.length() - str.replace(".", "").length();
        int commas = str.length() - str.replace(",", "").length();
        
        if(dots == 0 && commas == 0){
            return removeNonNumberChars(str);
        }
        else if(dots == 1 && commas > 1){
            return removeNonNumberChars(removeCommas(str));
        }
        
        else if(commas == 1 && dots > 1){
            return removeNonNumberChars(removeDots(commaToDot(str)));
        }
        else if(commas == 1){
            return removeNonNumberChars(commaToDot(str));
        }
        else{
            return removeNonNumberChars(str);
        }
    }
    
    /**
     * Removes al characters after the first dot "."
     * @param str
     * @return 
     */
    public String removeAfterFloatingPoint(String str){
        int spaceIndex = str.indexOf(".");
        if (spaceIndex != -1)
        {
            return str.substring(0, spaceIndex);
        }
        return str;
    }
}

