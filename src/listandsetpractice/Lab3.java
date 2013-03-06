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
        Employee e2 = new Employee("A413","Oscar Goldman", 227);
        Employee e3 = new Employee("Q1","Rudy Wells", 227);
        Dog d1 = new Dog("Fido", 10, "BR549");
        
        List livingBeing = new ArrayList(); 
        livingBeing.add(e1);
        livingBeing.add(e2);
        livingBeing.add(e3);
        livingBeing.add(d1);
        
        for(int i=0; i < livingBeing.size(); i++) {
            String out = livingBeing.get(i).toString();
            System.out.println(out);
        }
    }
        
        
        
        
        
           
}
