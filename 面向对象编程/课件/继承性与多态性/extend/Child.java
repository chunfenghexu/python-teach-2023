package extend;

class Child2 extends Parent{
    
}
public class Child extends Parent {
    public String occupation;
    public Child(String name, int age,String occupation) {
        super(name, age); // 开头
        this.occupation = occupation;
    }

    public String toString() {
        return   this.occupation;
    }
    public boolean equals(Object a){
        if(a instanceof Child){
            Child c = (Child)a;
            return this.getName().equals(c.getName()) &&
                    this.age == c.age &&
                    this.occupation.equals(c.occupation);
        }
        return false;
    }
    public void method1() {

    }


    public static void main(String[] args) {
        // 向上转型 ，这个上指的就是父类
        Child c = new Child("xxx",13,"teacher");
        Child c0 = new Child("xxx",13,"teacher");
        Parent p = (Parent) c;
        Parent p2 = p;
        Parent p1 = new Parent("sss",10);
        // 第一种相等 ： 是不是同一个对象
        // Java == 除了基本数据类型外，对于对象类型的比较都是第一种相等的含义
        if(p2.equals(c)){
            System.out.println("p2 == c");
        }
        if(p2.equals(p)){
            System.out.println("p2 == p");
        }
        // 第二种相等 ： 不是同一个对象，但是对象的属性的值都是一样的
        if(c.equals(p1)){
            System.out.println("c equals p1");
        }
        // Parent p = (Parent)new Parent("xxx",13);
        // 下面的代码中，不会出现很多子类型的名字，出现的都是父类型的名字

        // 向下转型 不总是正确的
        //System.out.println(p1.toString());
        // Child c = (Child)new Parent("sss",10); 会报运行时异常错误
        if(p1 instanceof Child){
            Child c1 = (Child)p1;
            System.out.println("p 是 Child类型");
        }
        else{
            System.out.println("p 不是 Child类型");
        }


        // 去使用子类一些特有的方法
        
    }
}