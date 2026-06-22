import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) mat[i][j]=sc.nextInt();
        
        boolean flag=true;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(mat[i][j]!=mat[j][i]) flag=false;
        
        System.out.println(flag?"Symmetric":"Not Symmetric");
    }
}
