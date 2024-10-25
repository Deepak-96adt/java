class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}

public class ExampleThread {
    public static void main(String[] args) {

        // Example-1 of making thread extends Thread
        Thread1 t1 = new Thread1();
        t1.start();

        // Example-2 of making thread with implements Runnable
        Runnable t2 = new Thread2();
        Thread rt2 = new Thread(t2);
        rt2.start();

        // Example-3 of making thread with Anonymous inner classes
        Runnable t3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 6; i++) {
                    System.out.println("Good day");
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }
        };
        Thread rt3 = new Thread(t3);
        rt3.start();

        // Example-4 of making thread with Lambda expression      // because runable interface is also @FunctionalInterface
        Runnable t4 = () -> {
            for (int i = 1; i < 6; i++) {
                System.out.println("Good Night");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        };
        Thread rt4 = new Thread(t4);
        rt4.start();
    }
}
