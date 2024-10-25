package Lambda;

public class SumMain {
    public static void main(String[] args) {
        SumFuncInterface sumAno = (a,b)-> a-b; 
        System.out.println(sumAno.sub(83,45));
    }
}
