public class ArrayWithLoops {
    public static void main(String[] args) {
        // int random = (int)(Math.random()*10);     // same value in every index
        int arr[] = new int[5];

        //Setter array
        for (int i = 0; i < 5 ; i++) {
            arr[i]=(int)(Math.random()*10);
        }

        // first type
        System.out.println("for loop");
        for (int i = 0; i < 5 ; i++) {
            System.out.print(arr[i]+" ");
        }

        // Second type
        System.out.println();
        System.out.println("for Each loop");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
        // third type
        System.out.println();
        System.out.println("while loop");
        int i = 0;
        while (i<5) {
            System.out.print(arr[i]+" ");
            i++;
        }

    }
}
