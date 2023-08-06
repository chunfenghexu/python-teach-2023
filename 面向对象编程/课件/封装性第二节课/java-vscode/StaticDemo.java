import java.util.ArrayList;

public class StaticDemo{
    static private int s_num=0;  // 类属性 ，统计了我当前生成了多少个StaticDemo的对象/实例
    private int a_num;           // 实例属性

    public static int getNum(){
        return s_num;
    }
    // 构造函数 -> 实例化对象的时候调用(new的时候)
    public StaticDemo(int a_num){  
        s_num++; //计数， 计当前生成了多少个StaticDemo对象
        this.a_num = a_num;
    }
    public int getANum(){
        return a_num;
    }
    // 实例方法
    public int getSNum(){
        return s_num;
    }
    public static void main(String[] args) {
        ArrayList<StaticDemo> arr = new ArrayList<StaticDemo>();
        for(int i=0;i<10;i++){
            arr.add(new StaticDemo(i)); // list.append(i)
        }
        for(int i=0;i<10;i++){
            System.out.println(arr.get(i).getSNum());
            System.out.println(arr.get(i).getANum());
        }
        System.out.print(StaticDemo.s_num); // 类名.类属性
        StaticDemo c = new StaticDemo(0);
        System.out.print(c.s_num); // 类名.类属性
    }
}