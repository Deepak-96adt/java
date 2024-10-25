/**
 * TestInterface
 */
public interface TestInterface {
    public void add();
    default void add2(){
        System.out.println("add2");
    }
}

// interface Test2{
//     public void display();
// }