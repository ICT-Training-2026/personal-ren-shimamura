package example1;

public class Person {
    private String name;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Person(String name) {
        this.name = name;
    }
 
    public String introduce() {
    	return "私は" + name + "と申します。";
    }
}
