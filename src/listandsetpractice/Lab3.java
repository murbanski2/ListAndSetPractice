package listandsetpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author murbanski
 */
public class Lab3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("B27","Steve Austin", 227);
        Employee e2 = new Employee("A413","Oscar Goldman", 167);
        Employee e3 = new Employee("Q1","Rudy Wells", 100);
        Dog d1 = new Dog("Fido", 10, "BR549");
        
        List livingBeings = new ArrayList(); 
        livingBeings.add(e1);
        livingBeings.add(e2);
        livingBeings.add(e3);
        livingBeings.add(d1);
        
        //This was my first solution.  Since both objects have a toString(), it
        //seemed like a way to treat everything the same.
        for(int i=0; i < livingBeings.size(); i++) {
            String out = livingBeings.get(i).toString();
            System.out.println(out);
        }
        
        System.out.println("\n\n");
        
        //This is the way that you could get individualized information
        //from each object.  The problem with this is that it is too rigid.
        //You can improve the situation by making a LivingBeing interface
        //class that both of these inherit.  Employee would probably inherit
        //thru a Person class, or something similar.  The abstract class
        //could provide some common methods that could then be used polymorphically.
        //
        //Ultimately, though, the best choice might be to create a List of
        //Employee objects and a list of Dog objects, and then do Employee
        //reporting with one loop, and Dog reporting with a second loop.
        
        for(int i=0; i < livingBeings.size(); i++) {
            Object lb = livingBeings.get(i);
            if(lb instanceof Employee){
                Employee emp = (Employee) lb;
                System.out.println("The employee " + emp.getName() 
                        + " in department " + emp.getDepartmentNumber() 
                        + " is a very fine person.");
            }
            if(lb instanceof Dog) {
                Dog doggie = (Dog) lb;
                System.out.println("I saw the dog " + doggie.getName() 
                        + " going out for a walk.  Its rabies tag had the number " 
                        + doggie.getRabiesId() + ".");
            }
        }
    }
        
        
        
        
        
           
}
