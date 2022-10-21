package String;

public class StringCommonApI {
    public static void main(String[] args){

        //String 常用API

        //1.public int length()
        // 获取字符串的长度
        String name="我loveyouchina";
        //int length=name.length();
        System.out.println(name.length());

        //2.public char charAt(int index)
        // 获取某个索引位置的字符
        System.out.println(name.charAt(1));

        System.out.println("----遍历字符串中的每个字符-----");
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        //3.public char[] toCharArray()
        // 把字符串转换成字符数组返回
        char[] arr=name.toCharArray();
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        //4.public String substring(int beginIndex,int endIndex)
        // 截取内容，包前不包后(计算机中很多情况都是包前不包后)

        //4.public String substring(int beginIndex)
        // 截取内容,从当前索引一直截取到末尾
        //index都是从0开始的
        String name2="我正在学的语言是Java";
        System.out.println(name2.substring(5,7));
        System.out.println(name2.substring(5));

        //5.public String replace(CharSequence target,CharSequence replacement)
        //target 目标         replacement 替换物，代替品
        //使用新值，将字符串中的旧值替换，得到新的字符串
        String name3="你怕不是个sb";
        String rs3=name3.replace("sb","憨批");
        System.out.println(rs3);

        //6.public boolean contains(CharSequence s)
        //sequence 序列，数列
        // 查找是否包含某内容，精准判断
        System.out.println(name3.contains("怕怕"));
        System.out.println(name3.contains("怕"));

        //7. public boolean startsWiths(String prefix)
        //prefix 前缀
        //判断一个String是否以某内容开始,精准判断
        System.out.println("7.  "+name3.startsWith("你"));

        //8.public String[] split(String s)
        //split 分裂分开
        //根据传入的规则切割字符串，得到字符串数组返回
        String name4="aa,bb,cc,dd";
        String[] names=name4.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println("选择了："+names[i]);
        }
    }
}
