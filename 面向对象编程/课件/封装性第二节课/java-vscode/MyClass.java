//UML类图是一种静态结构图
class MyClass2{
    private int a;
    private String b;
    public MyClass2(int a , String b){
        this.a = a;
        this.b = b;
    }
    public String getB(){
        return this.b;
    }
    public void setB(String b){
        this.b = b;
    }
    public int getA(){
        return this.a;
    }
}
public class MyClass{
    private String name;
    private int number;
    private MyClass2 mc;
    public MyClass(){
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean setName(int name){
        return true;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setMc(MyClass2 mc){
        this.mc = mc;
        this.mc.setB("world");
    }
    public static void main(String[] args) {
        MyClass mc1 = new MyClass(); //实例化对象
        MyClass mc2 = new MyClass();
        String a = "hello"; //对象类型
        String b = "world";
        // 参数是对象类型的时候  可变类型 列表、字典
        mc1.setName(a);
        mc2.setName(b);
        // 参数是基本数据类型的时候
        int n1 = 10;
        int n2 = 100;
        mc1.setNumber(n1);
        mc2.setNumber(n2);

        MyClass2 mc21 = new MyClass2(10, "hello");
        mc1.setMc(mc21);
        System.out.println(mc21.getB());
    }
}
