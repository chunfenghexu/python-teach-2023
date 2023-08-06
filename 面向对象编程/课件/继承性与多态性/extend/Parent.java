package extend;

public class Parent {
    private String name;
    protected int age;

    //public Parent(){}
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString() {
        // json格式呈现出来
        return "{" +
               "    name:" + this.name + ",\n" +
               "    age :" + this.age + "\n" +
               "}" ; 
    }
}