package week2;

import java.util.Scanner;

public class exam2021091 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] B=new int[n];
        int sumMax=0,sumMin=0;
        for(int i=0;i<n;i++){// max
            B[i]=sc.nextInt();
            sumMax+=B[i];
        }
        sumMin+=B[0];
        for(int i=1;i<n;i++){// min
            sumMin+=B[i]==B[i-1]?0:B[i];
        }
        System.out.println(sumMax);
        System.out.println(sumMin);
    }
}
