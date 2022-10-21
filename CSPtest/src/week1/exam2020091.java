package week1;

import java.util.Scanner;

public class exam2020091 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int[][] position=new int[n+1][2];
        int[] distance=new int[n+1];
        for(int i=1;i<=n;i++){
            position[i][0]=sc.nextInt();
            position[i][1]=sc.nextInt();
            distance[i]=(position[i][0]-X)*(position[i][0]-X)+(position[i][1]-Y)*(position[i][1]-Y);
        }

        int min,index=0;
        for(int j=0;j<3;j++){
            min=-1;
            for(int i=1;i<=n;i++){
                if(min==-1 && distance[i]>=0){
                    min=distance[i];
                    index=i;
                    distance[i]=-1;
                }

                if(distance[i]<min && distance[i]>=0){
                    distance[index] = min;
                    min = distance[i];
                    index = i;
                    distance[i] = -1;
                }
            }
            System.out.println(index);
        }


    }
}
