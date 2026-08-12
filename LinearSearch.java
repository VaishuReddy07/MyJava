public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {3,1,7,4,9,2};
        int target = 9;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                System.out.println("Found at index" + i);
                break;
            }


        }

        
    }
    
}
