package example3;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("円の半径を入力してください：");
        double radius = scan.nextDouble();

        try {
        
            if (radius <= 0) {
                throw new InvalidValException("円の半径が0以下となっています");
            } 
            else {
                Circle c = new Circle(radius);
                System.out.println("円の面積は" + c.area() + "です");
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
 
    }
}
