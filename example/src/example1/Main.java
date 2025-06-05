import java.util.HashMap;
import java.util.Map;
 
public class Main{
    public static void main(String[] args) {
    	
    	HashMap<String, String> emp = new HashMap<>();
    	
        Person p1 = new Person("木村");
        Person p2 = new Person("山田");
        Person p3 = new Person("田中");
        
        
        emp.put("A13", p1);
        emp.put("A12", p2);
        emp.put("A14", p3);
 
        
        }
    }
}