package String;

import java.util.Scanner;

public class StringApply2 {
    public static void main(String[] args) {
        //正确的账号密码
        String okLoginName="728";
        String okPassword="150";

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("账号：");
            String loginName=sc.next();
            System.out.println("密码：");
            String password=sc.next();

            if(okLoginName.equals(loginName)){
                if(okPassword.equals(password)){
                    System.out.println("Login Successfully!");
                    break;
                }else {
                    System.out.println("Your Password Is Wrong!");
                }
            }else {
                System.out.println("Your LoginName Is Wrong!");
            }
        }
    }
}
