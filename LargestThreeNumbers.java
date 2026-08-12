public class LargestThreeNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 35;
        int c = 20;
        if(a>b && a>c)
        {
            System.out.println("Largest number is: " + a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Largest number is: " + b);
        }
        else
        {
            System.out.println("Largest number is: " + c);
        }
    }
    
}
