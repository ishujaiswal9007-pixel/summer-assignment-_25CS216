import java.util.*;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Set<Character> seen = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                System.out.println("First repeating character: " + c);
                return;
            }
            seen.add(c);
        }
        System.out.println("No repeating character found.");
    }
}

