package example1;

import java.util.HashMap;
 
public class Main{
    public static void main(String[] args) {
    	
    	HashMap<String, String> emp = new HashMap<>();
    	
        Person p1 = new Person("木村");
        Person p2 = new Person("山田");
        Person p3 = new Person("田中");
        
        emp.put("A13", p1.getName());
        emp.put("A12", p2.getName());
        emp.put("A14", p3.getName());

        for (String key : emp.keySet()) {
            System.out.println("社員番号：" + key);
            System.out.println(p1.introduce());
        }
        
        }
    }