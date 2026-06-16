import java.util.*;

public class MaxFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        int maxFreq = 0, element = -1;
        for(Map.Entry<Integer,Integer> e : freq.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                element = e.getKey();
            }
        }
        System.out.println("Element with maximum frequency: " + element);
    }
}
