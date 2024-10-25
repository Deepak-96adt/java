class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println("user define thread started.....");
        Thread userThObj = Thread.currentThread();
        System.out.println("this is current thread name : "+userThObj.getName());
        userThObj.setName("userThObj");
        System.out.println("this is current thread new name : "+userThObj.getName());
        System.out.println("this is current thread id : "+userThObj.getId());
        System.out.println("this is current thread class : "+userThObj.getClass());
        System.out.println("user define thread ended.....");
    }
} 


public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("main started.....");

        Thread mainThread = Thread.currentThread();
        System.out.println("this is current thread name : "+mainThread.getName());
        mainThread.setName("myMain");
        System.out.println("this is current thread new name : "+mainThread.getName());
        System.out.println("this is current thread id : "+mainThread.getId());
        System.out.println("this is current thread class : "+mainThread.getClass());

        UserThread threadObj = new UserThread();
        Thread userThread = new Thread(threadObj);
        userThread.start();
        
        System.out.println("main ended.....");
    }
}
