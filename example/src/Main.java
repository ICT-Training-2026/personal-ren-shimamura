import java.util.ArrayList;
 
public class Main{
    public static void main(String[] args) {
    	
    	ArrayList<String> fruits = new ArrayList<>();

        fruits.add("りんご");
        fruits.add("みかん");
        fruits.add("バナナ");
        fruits.add("スイカ");
        fruits.add("メロン");
        
        for(String item : fruits ) {
        	System.out.println(item);
        }

    }
}