class Producer extends Thread {
        Company c;

        public Producer(Company c){
            this.c=c;
        }

        @Override
        public void run() {
            int i=1;
            while (true) {
                try {
                    this.c.producer_item(i);
                    Thread.sleep(1200);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                i++;
            }
        }
}
