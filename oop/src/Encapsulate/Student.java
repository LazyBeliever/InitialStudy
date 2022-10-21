package Encapsulate;

public class Student {
    private int age;



    public void setAge(int age){
        if(age>=0&age<=200){
            this.age=age;
        }else {
            System.out.println("年龄有问题");
        }
    }
    public int getAge(){
        return age;
    }
}
