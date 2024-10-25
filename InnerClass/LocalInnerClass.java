class OuterClass2{
    static int a = 10;
    int b = 20;
    public void outerMethod(){
        class InnerClass2{
            public void demo(){
                System.out.println("demo method called from innter class , a = "+a);
                System.out.println("demo method called from innter class , b = "+b);
            }
        }
        InnerClass2 localObj = new InnerClass2();
        localObj.demo();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass2 outerClassObj = new OuterClass2();
        outerClassObj.outerMethod();
    }
}
