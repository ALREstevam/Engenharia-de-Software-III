/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.parse;

import java.text.DecimalFormat;
import java.util.concurrent.Callable;

/**
 * Parses Strings to Numbers
 * Helps to get numbers from the user when the input is made by a String
 * @author andre
 */
public class NumberParser {
    
    /**
     * Parses a String to an Integer preformatting and 
     * cleaning the String before it
     * @param str
     * @return 
     * @throws NumberFormatException 
     */
    public static Integer getIntegerFrom(String str) throws NumberFormatException{
        str = cleanInteger(str);
        
        if(validate(str)){
            try{
                return Integer.parseInt(str);
            }
            catch(NumberFormatException e){
                return getDoubleFrom(str).intValue();
            }
        }
        throw new NumberFormatException("Empty String after clean.");
    }
    
    /**
     * Parses a String to a Long preformatting and 
     * cleaning the String before it
     * @param str
     * @return 
     * @throws NumberFormatException 
     */
    public static Long getLongFrom(String str) throws NumberFormatException{
       str = cleanInteger(str);
        if(validate(str)){
            try{
               return Long.parseLong(str);
            }
            catch(NumberFormatException e){
                return getDoubleFrom(str).longValue();
            }
        }
        throw new NumberFormatException("Empty String after clean.");
    }
    
    /**
     * Parses a String to a Short preformatting and 
     * cleaning the String before it
     * @param str
     * @return 
     * @throws NumberFormatException 
     */
    public static Short getShortFrom(String str) throws NumberFormatException{
        str = cleanInteger(str);
        if(validate(str)){
            try{
                Short.parseShort(str);
            }
            catch(NumberFormatException e){
                return getDoubleFrom(str).shortValue();
            }
        }
        throw new NumberFormatException("Empty String after clean.");
    }
    
    /**
     * Parses a String to a Float preformatting and 
     * cleaning the String before it
     * @param str
     * @return 
     * @throws NumberFormatException 
     */
    public static Float getFloatFrom(String str) throws NumberFormatException{
       str = clean(str);
        if(validate(str)){
            return Float.parseFloat(str);
        }
        throw new NumberFormatException("Empty String after clean.");
    }
    
    /**
     * Parses a String to a Double preformatting and 
     * cleaning the String before it
     * @param str
     * @return 
     * @throws NumberFormatException 
     */
    public static Double getDoubleFrom(String str) throws NumberFormatException{
        str = clean(str);
        if(validate(str)){
            return Double.parseDouble(str);
        }
        throw new NumberFormatException("Empty String after clean.");
    }
    
    public static String DoubleToDecimalString(Double value){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
    
    
    public static boolean isParseable(String str){
        try{
            getDoubleFrom(str);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    /**
     * Calls the standard cleanner for general numbers
     * @param str
     * @return 
     */
    private static String clean(String str){
        return getStrCleaner().stdCleanner(str);
    }
    
    /**
     * Calls the standard cleanner and formats the String to be 
     * parsed as an Integer/Short/Long
     * @param str
     * @return 
     */
    private static String cleanInteger(String str){
        return getStrCleaner().removeAfterFloatingPoint(getStrCleaner().stdCleanner(str));
    }
    
    /**
     * Validates a given String 
     * verifying if the given string is null or empty
     * @param str
     * @return 
     */
    private static boolean validate(String str){
        return !(str == null || str.isEmpty());
    }
    
    /**
     * Makes an instance of getStrCleaner
     * @return 
     */
    private static StrCleaner getStrCleaner(){
        return new StrCleaner();
    }
}
