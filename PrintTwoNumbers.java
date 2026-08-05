import java.util.Scanner;
public class PrintTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("enter secong number");
        int b = sc.nextInt();
        System.out.println("addition" +(a+b));
        System.out.println("subtraction" +(a-b));
        System.out.println("Division" + (a/b));
        System.out.println("Multiplication" + (a*b));
        System.out.println("Modulus" + (a%b));
        
    }
    
}
