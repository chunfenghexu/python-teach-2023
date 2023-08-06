public class Hello{
    final private String a;
    private String name;
    //构造函数
    public Hello(String name){
        a = "233";
        this.name = name;
    }
    public void method1(int a , MyClass mc){
        a = 10;
        mc.setName("10");
    }
    public static void main(String[] args) {
        Hello h = new Hello("sss");
        MyClass mc = new MyClass(); // 地址
        mc.setName("0");
        int a = 0;
        h.method1(a, mc);
        System.out.println(a); // 0
        System.out.println(mc.getName()); // 10
    }
}