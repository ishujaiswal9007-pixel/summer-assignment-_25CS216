import java.util.*;

public class SortWordsByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String[] words = sc.nextLine().split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Words sorted by length:");
        for (String word : words) System.out.println(word);
    }
}
