class Consumer extends Thread {
    Company c;

    public Consumer(Company c){
        this.c=c;
    }
        
    @Override
    public void run() {
        while (true) {
            try {
                this.c.consume_item();
                Thread.sleep(1500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        } 
    }
}
