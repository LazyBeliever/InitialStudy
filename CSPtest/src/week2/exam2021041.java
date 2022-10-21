package week2;

import java.util.Scanner;

public class exam2021041 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int L=sc.nextInt();
        int[][] matrix=new int[n][m];
        int[] histogram=new int[L];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
                histogram[matrix[i][j]]++;
            }
        }
        for(int i=0;i<L;i++) {
            System.out.print(histogram[i]+" ");
        }
    }
}
