package javaPractice.oops;

public class Overloading {
    public void m1(){
        System.out.println("i am in method m1()");
    }

    public void m1(int a){
        System.out.println("i am in method m1(int a)");
    }
    public void m1(int a,int b){
        System.out.println("i am in method m1(int a,int b)");
    }

    public static void main(String[] args) {

        Overloading overloading= new Overloading();
        overloading.m1();
        overloading.m1(10);
        overloading.m1(10,20);
    }
}
