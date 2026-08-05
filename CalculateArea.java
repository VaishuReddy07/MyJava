import java.util.Scanner;
public class CalculateArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Breadth");
        int breadth = sc.nextInt();
        System.out.println("Enter your Length");
        int length = sc.nextInt();
        int area = breadth * length;
        System.out.println("Area of Square is " +area);
        sc.close();
    }
    
}
