package Array;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberRandom {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int[] data=new int[5];

        //动态生成5个1-20之间的随机数并存入数组
        Random r=new Random();
        for(int i=0;i<data.length;i++){
            data[i]=r.nextInt(20)+1;
        }
        System.out.println("数字介于0-20");
        System.out.println("不想玩了就输入-1");
        OUT:
        while(true){
            System.out.println("你想猜什么？");
            //获取猜的数字
            int guessData=sc.nextInt();
            if(guessData==-1){
                System.out.println("哈哈，认输了吧！看一下究竟是哪五个数字吧！");
                break;
            }
            for(int i=0;i<data.length;i++){
                if(data[i]==guessData) {
                    System.out.println("运气不错哦！您猜中的数字是第"+(i+1)+"个");
                    System.out.println("来看看这五个数字都是多少吧");
                    //用break只能结束内部循环
                    break OUT;//break OUT 能结束整个循环
                }
            }
            System.out.println("没有您猜的这个数字哦！");
        }
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+"\t");
        }
    }
}
