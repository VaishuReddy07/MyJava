import java.util.Scanner;
public class PrintAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Your age is" +age);
    }
    
}
