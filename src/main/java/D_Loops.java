public class D_Loops {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        //while
        int j = 0;
        while (j < 10) {
            System.out.println("j = " + j);
            j++;
        }

        //do while
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 10);


        //for each
        int[] l = {1, 2, 3, 4, 5}; // this is an array
        for (int m : l) {
            System.out.println("m = " + m);
        }


    }
}
