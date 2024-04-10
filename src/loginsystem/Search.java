/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

/**
 *
 * @author koosh
 */
public class Search {
    
    public static int binarySearch(String term, String[] list) {
        int low = 0;
        int high = list.length - 1; 
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (list[mid].equals(term)) {
                return mid;
            } else if (list[mid].compareTo(term) > 0) { 
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
    
    //returns the index or -1
     public static int seqSearch(String term, String[] list) {
         
         int i; 
         boolean userFound = false; 
         for (i = 0; i < list.length; i++){

             
             if (list[i].equals(term)){
                 userFound = true; 
                 return i; 
             }
             
         }
         
         if (userFound == false){
             i = -1; 
         }
         
         return i; 
         
         
     }

    
    


}
