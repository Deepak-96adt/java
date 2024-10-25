public class CreationOfArray {
    public static void main(String[] args) {
        int arr[] = new int[5];  //fixed size
        arr[0] = 7;
        arr[1] = 17;
        arr[2] = 71;
        arr[3] = 74;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);   //0
        System.out.println(arr[5]);   //java.lang.ArrayIndexOutOfBoundsException

        
        int arr2[] = {2,4,1,6};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);   //java.lang.ArrayIndexOutOfBoundsException
    }
}
