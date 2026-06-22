import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String str = sc.nextLine();
        
        String result = str.replaceAll("\\s+", "");
        System.out.println("String without spaces: " + result);
    }
}

