public class MyThreadWithRunable implements Runnable {
    @Override
    public void run(){
        for (int i = 1; i < 11; i++) {
            System.out.println("value of i : "+i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        MyThreadWithRunable myThreadObj = new MyThreadWithRunable();
        Thread threadObj = new Thread(myThreadObj);
        threadObj.start();

        MyAnotherThread anotherThreadObj = new MyAnotherThread();
        anotherThreadObj.start();
    }
}
