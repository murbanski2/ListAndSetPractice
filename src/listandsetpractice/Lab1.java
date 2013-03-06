package listandsetpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author murbanski
 */
public class Lab1 {
    public static void main(String[] args) {
        List hobbyList = new ArrayList();
        hobbyList.add("bicycle");
        hobbyList.add("helmet");
        hobbyList.add("water bottle");
        hobbyList.add("shoes");
        
        for(int i=0; i < hobbyList.size(); i++) {
            String out = (String)hobbyList.get(i);
            System.out.println(out);
        }
        
        
    }
}
