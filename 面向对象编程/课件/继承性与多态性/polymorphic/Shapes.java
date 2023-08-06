public class Shapes{
    public static Shape randShape(){
        int a = (int)(Math.random()*3);
        // (int)Math.random() * 3
        System.out.println(a);
        switch(a){
            case 1 : return new Circle();
            case 2 : return new Square();
        }
        return new Circle();
    }
    public static void main(String[] args) {
        Shape[] s = new Shape[5];
        for(int i=0;i< s.length ; i++){
            s[i] = randShape();  // 变量的多态性
        }
        for(int i=0;i<s.length;i++){
            s[i].draw();   // 方法的多态性
            s[i].erase();
        }
    }
}