package LinerList;

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // 1 2 3 4 5 6 7
        // 4 5 6 7 1 2 3
        int temp;
        for(int i=0;i<m/2;i++){
            temp=arr[i];
            arr[i]=arr[m-1-i];
            arr[m-1-i]=temp;
        }
        for(int i=m;i<(n+m)/2;i++){
            temp=arr[i];
            arr[i]=arr[n-1-i+m];
            arr[n-1-i+m]=temp;
        }
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
