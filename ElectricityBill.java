public class ElectricityBill {
    public static void main(String[] args) {
        int units = 250;
        double billAmount;
        if (units <= 100) {
            billAmount = units * 5;
        } else if (units <= 200) {
            billAmount = (100 * 5) + ((units - 100) * 7);
        } else {
            billAmount = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }
        System.out.println("Electricity Bill Amount: " + billAmount);
    }
    
}
