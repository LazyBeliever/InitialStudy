package Array;

import java.util.Random;
import java.util.Scanner;

public class DisruptOrder { //斗地主洗牌可以用随机排名
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入有多少个工号");
        int n=sc.nextInt();
        int[] order=new int[n];

        System.out.println("输入工号");
        for(int i=0;i<n;i++){
            order[i]=sc.nextInt();
        }
        //遍历数组中的每个元素,然后随机一个位置出来,
        //让该元素与随机位置的元素进行交换
        Random r=new Random();
        int temp;
        for(int i=0;i<order.length;i++){
            //随机一个位置
            int index=r.nextInt(order.length);
            temp=order[index];
            order[index]=order[i];
            order[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(order[i]+"\t");
        }
    }
}
