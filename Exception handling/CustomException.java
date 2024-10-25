class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class CustomException {
    static void demo() throws MyException {
        demo2();
    }

    @SuppressWarnings("unused")
    static void demo2() throws MyException {
        if (10 < 6) {
            throw new MyException("10 is greater than 6");
        } else {
            throw new MyException("10 is smaller than 6");
        }
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("after Demo Called");
        } catch (MyException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {

        }
    }
}