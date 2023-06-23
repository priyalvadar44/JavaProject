package javaPractice.oops;

public class Overriding {

    public static void main(String[] args) {

       Parent p1= new Parent();
       p1.m1();
       p1.m2(10);

        Parent p2= new Child();
        p2.m1();
        p2.m2(10);

        Child c1= new Child();
        c1.m1();
        c1.m2(10);

    }
}

class Parent{

    public void m1(){
        System.out.println("i am in parent m1() ");
    }
    public void m2(int a){
        System.out.println("i am in parent m2(int a) ");
    }
}

class Child extends Parent{
    public void m1(){
        System.out.println("i am in child m1() ");
    }
    public void m2(int a){
        System.out.println("i am in child m2(int a) ");
    }
}
