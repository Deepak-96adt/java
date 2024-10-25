public class TestFunctionalInterface {

    public static void main(String[] args) {
        FunctionInterfaceDemo fd=()->{
            System.out.println("sum calling");
        };
        fd.sum();
    }
    
}
