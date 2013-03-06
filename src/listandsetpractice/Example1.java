package listandsetpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author murbanski
 */
public class Example1 {

    public static void main(String[] args) {
//        List groceryList = new ArrayList();        
//        groceryList.add("Beer");
//        groceryList.add("Pizza");
//        groceryList.add("Chips");
//    
//        //String item = groceryList.get(1).toString(); 
//        String item = (String)groceryList.get(1); //Casting - rigid
//        System.out.println(groceryList.size());
//        groceryList.remove(2);
//        System.out.println(groceryList.size());
//        
//        for(int i=0; i<groceryList.size();i++) {
//            String s = (String)groceryList.get(i);
//            System.out.println(s);
//        }
        
        

        List<String> groceryList = new ArrayList<String>(); //using generics
        groceryList.add("Beer");
        groceryList.add("Pizza");
        groceryList.add("Chips");
    
        String item = groceryList.get(1); 
        
        for(String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("");
               
        
        groceryList.add(2, "Pretzels");
        groceryList.add(1, "Mountain Dew");
        for(String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("");
        
        //groceryList.clear();
        groceryList.remove(3);
        for(String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("");
        
        groceryList.add("Beer");
        for(String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("");
        
        groceryList.remove("Beer");
        for(String s : groceryList) {
            System.out.println(s);
        }
        

        
    }
}
