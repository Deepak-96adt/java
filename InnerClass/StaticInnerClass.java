class OuterClass{
    static int a = 10;
    int b = 20;
    static class InnerClass{
        public void demo(){
            System.out.println("demo method called from innter class , a = "+a);
            // System.out.println("demo method called from innter class , b = "+b);  //it will give you error
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.demo();
    }
}
