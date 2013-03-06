package listandsetpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author murbanski
 */
public class Lab2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("B27","Steve Austin", 227);
        Employee e2 = new Employee("A413","Oscar Goldman", 167);
        Employee e3 = new Employee("Q1","Rudy Wells", 100);
        
        List<Employee> employees = new ArrayList<Employee>(); 
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        for(Employee e:employees){
            String s = e.getName();
            System.out.println(s);
        }
    }
}
