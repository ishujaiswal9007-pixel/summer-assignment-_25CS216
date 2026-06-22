import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int[] freq = new int[256]; // ASCII size
        
        for(char c : str.toCharArray()) {
            freq[c]++;
        }
        
        System.out.println("Character frequencies:");
        for(int i = 0; i < 256; i++) {
            if(freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}

