interface Gas {
    void flameable();
    // static void flameable(){
    //     System.out.println("this must be flameable");
    // }
} 

class Petrol implements Gas{
    public void flameable(){
        System.out.println("Petrol is flameable");
    }
}

class LPG implements Gas{
    public void flameable(){
        System.out.println("LPG is flameable");
    }
}

public class WithInterface {
    public static void main(String[] args) {
        Petrol petrolObj = new Petrol();
        petrolObj.flameable();
        LPG lpgObj = new LPG();
        lpgObj.flameable();
    }
}
