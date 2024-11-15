import java.util.*;
public class Wap22 {
    public static void main(String[] args){
        Scanner o1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = o1.nextInt();
        double b = o1.nextInt();
        double c = o1.nextInt();
        double s = a + b + c / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is: " + area);
        o1.close(); 
    }
}
