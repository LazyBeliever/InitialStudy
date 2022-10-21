package String;

import java.util.Random;

public class StringApply1 {
    public static void main(String[] args) {

        //开发验证码功能
        //随机生成一个五位的验证码，每位科恩那个是数字，大/小写字母

        //定义一个String类型的变量存储a-z，A-Z，0-9之间的全部字符
        //循环五次，随机一个范围内的碎银，获取对应字符连接起来即可

        String datas="abcdefghijklnmopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r=new Random();
        String code="";
        for (int i = 0; i < 5; i++) {
            int index=r.nextInt(datas.length());
            char c = datas.charAt(index);
            code += c;
        }
        System.out.println(code);
    }
}
