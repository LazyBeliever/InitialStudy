package FirstTry;

public class Test2 {
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="yc";
        s1.sex='男';
        s1.hobby="吃饭，睡觉，打豆豆";

        Student s2=s1;
        System.out.println(s2);
        System.out.println(s2);
        s1.study();

        s2.hobby="233333";
        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s2.hobby);
        System.out.println(s1.hobby);
        s1.study();

    }
}
