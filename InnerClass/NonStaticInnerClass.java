class OuterClass1{
    static int a = 10;
    int b = 20;
    class InnerClass1{
        public void demo(){
            System.out.println("demo method called from innter class , a = "+a);
            System.out.println("demo method called from innter class , b = "+b);
        }
    }
}

public class NonStaticInnerClass {
    public static void main(String[] args) {
        OuterClass1 outerClassObj = new OuterClass1();
        OuterClass1.InnerClass1 innerClassObj = outerClassObj.new InnerClass1();
        innerClassObj.demo();
    }
}
