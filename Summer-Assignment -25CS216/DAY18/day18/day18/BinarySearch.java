import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int key=sc.nextInt();

        int low=0,high=n-1,mid,flag=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==key){ flag=mid; break; }
            else if(arr[mid]<key) low=mid+1;
            else high=mid-1;
        }
        if(flag!=-1) System.out.println("Found at index "+flag);
        else System.out.println("Not Found");
    }
}
