package week2;

import java.util.Scanner;

public class exam20210401 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int L = scan.nextInt();
        int [][]a =new int[n][m];
        int []h = new int[L];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                a[i][j] = scan.nextInt();
                h[a[i][j]]++;
            }
        }

        for(int i = 0;i<L;i++){
            System.out.print(h[i]+" ");
        }
    }

}