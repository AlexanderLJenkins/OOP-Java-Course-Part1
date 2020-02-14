/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Jenkins
 */
public class StringUtils {
    
    
    public static boolean included(String word, String searched) {
        // Checks word for searched, case and trailing white space insensitive
        
        if (word.isEmpty() || searched.isEmpty()) {
            return false;
        }
        
        // Same case
        word = word.toUpperCase();
        searched = searched.toUpperCase();
        
        // Trim leading or trailing white space from word and searched
        searched = searched.trim();
        word = word.trim();
        
        return word.contains(searched);
    }
}
