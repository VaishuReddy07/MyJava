import java.util.HashMap;

public class FirstNotRepeatedChar {
    public static void main(String[] args) {

        String str = "swiss";

      HashMap<java.lang.Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}