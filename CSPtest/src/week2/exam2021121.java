package week2;

import java.util.Scanner;

public class exam2021121 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int N=sc.nextInt();
        int[] A=new int[n+1];
        A[0]=0;
        for(int i=1;i<=n;i++){
            A[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=1;j<=n;j++){
                if(i>=A[n]){
                    sum+=n;
                    break;
                }
                if(i<A[j]) {
                    sum += j - 1;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
