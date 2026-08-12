public class PerfectNumber {
    public static void main(String[] args) {
        int num=6;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+1;
             }
             }
             if(sum==num){
                System.out.println("Perfect Number");
             }
             else{
                System.out.println("Not perfect Number");
             }
    }
    
}
