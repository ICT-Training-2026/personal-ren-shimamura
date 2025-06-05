package example2;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1つ目の小数を入力してください：");
        String numStr1 = scan.nextLine();
        System.out.print("2つ目の小数を入力してください：");
        String numStr2 = scan.nextLine();
 
        try {
		    double num1 = Double.parseDouble(numStr1);
            double num2 = Double.parseDouble(numStr2);
            System.out.println( "合計は"+(num1+num2)+"です");
		    
		} catch (NumberFormatException e) {
		    System.out.println("入力された値は数値ではありません");
		    
		}
    }
}