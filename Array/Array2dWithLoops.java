public class Array2dWithLoops {
    public static void main(String[] args) {
        // int random = (int)(Math.random()*10);     // same value in every index
        int arr[][] = new int[3][4];

        //Setter array
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j]=(int)(Math.random()*10);
            }
        }
        
        // first type
        System.out.println("for loop");
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Second type
        System.out.println();
        System.out.println("for Each loop start");
        for (int i[] : arr) {
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        // third type
        System.out.println();
        System.out.println("while loop");
        int i = 0;
        while (i<3) {
            int j = 0;
            while (j<4) {
                System.out.print(arr[i][j]+" ");
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
