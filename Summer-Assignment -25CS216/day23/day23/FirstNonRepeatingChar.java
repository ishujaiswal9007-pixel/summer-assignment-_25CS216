import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : freq.keySet()) {
            if (freq.get(c) == 1) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }
        System.out.println("No non-repeating chara

