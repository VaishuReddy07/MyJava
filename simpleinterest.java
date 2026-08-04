public class simpleinterest {
    public static void main (String[] args) {
        double p = 1000;
        double r = 5;
        double t = 4;
        double si=(p * r * t)/100;
        System.out.println("Simple Interest" + si);
        System.out.println("Total Amount" + (p+si));
        System.out.println("Total Amount" +( r +si));
    }

    
}
