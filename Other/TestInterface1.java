

class A implements TestInterface{
    @Override
    public void add(){
        System.out.println("add");
    }
    public void add2(){
        System.out.println("add2 new");
    }
    public void display(){
        System.out.println("display");
    }
}
    

public class TestInterface1  {

    public static void main(String[] args) {
        A aobj = new A();
        aobj.add2();

        TestInterface ti = new A();
        ti.add2();
        ti.add2();
        // TestInterface1 t=new TestInterface1();
        // t.add();
        // TestInterface tn = new TestInterface() {
        //     @Override
        //     public void add() {
        //         System.out.println("add is calling");

        //     }
        // };
        // tn.add();

        // Test2 t2 = new Test2() {
        //     @Override
        //     public void display() {
        //         // TODO Auto-generated method stub
        //         System.out.println("display calling");

        //     }
        // };
        // t2.display();
    }

}
