class Company {
    int n;
    boolean flag = false;
    synchronized public void producer_item(int n)throws Exception{
        if (flag) {
            wait();
        }
        this.n=n ;
        System.out.println("Produced : "+this.n) ;
        flag=true;
        notify();
    }    
    synchronized public int consume_item()throws Exception{
        if (!flag) {
            wait();
        }
        System.out.println("Consumed : "+this.n);
        flag=false;
        notify();
        return this.n;
    }    
}
