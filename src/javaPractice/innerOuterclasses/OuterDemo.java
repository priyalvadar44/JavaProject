package javaPractice.innerOuterclasses;

public class OuterDemo {
    private int n=133;

    class InnerDemo{

        public int printNum(){
            return n;
        }
    }
}

 class Test{
    public static void main(String[] args) {
        OuterDemo outerDemo=new OuterDemo();
        OuterDemo.InnerDemo innerDemo = outerDemo.new InnerDemo();

        System.out.println(  innerDemo.printNum());

    }
}
