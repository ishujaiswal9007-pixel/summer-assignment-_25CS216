public class CheckStringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String temp = s1 + s1;
        return temp.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println("Is Rotation: " + isRotation(s1, s2));
    }
}

