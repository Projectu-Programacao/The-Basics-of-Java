public class E_Arrays {
    public static void main(String[] args) {
        //array
        int[] a = {1, 2, 3, 4, 5}; // this is an array
        System.out.println("a[0] = " + a[0]);
        System.out.println("a[1] = " + a[1]);
        System.out.println("a[2] = " + a[2]);
        System.out.println("a[3] = " + a[3]);
        System.out.println("a[4] = " + a[4]);
        // System.out.println("a[5] = " + a[5]); // this will throw an error

        //array length
        System.out.println("a.length = " + a.length);

        //array loop
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        //array loop 2
        for (int b : a) {
            System.out.println("b = " + b);
        }

        //array 2d
        int[][] c = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("c[0][0] = " + c[0][0]);
        System.out.println("c[0][1] = " + c[0][1]);
        System.out.println("c[0][2] = " + c[0][2]);
        System.out.println("c[1][0] = " + c[1][0]);
        System.out.println("c[1][1] = " + c[1][1]);
        System.out.println("c[1][2] = " + c[1][2]);
        System.out.println("c[2][0] = " + c[2][0]);
        System.out.println("c[2][1] = " + c[2][1]);
        System.out.println("c[2][2] = " + c[2][2]);

        //array 2d loop
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println("c[" + i + "][" + j + "] = " + c[i][j]);
            }
        }

        //array 2d loop 2
        for (int[] d : c) {
            for (int e : d) {
                System.out.println("e = " + e);
            }
        }

        //array 3d
        int[][][] f = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}}};
        System.out.println("f[0][0][0] = " + f[0][0][0]);
        System.out.println("f[0][0][1] = " + f[0][0][1]);
        System.out.println("f[0][0][2] = " + f[0][0][2]);
        System.out.println("f[0][1][0] = " + f[0][1][0]);
        System.out.println("f[0][1][1] = " + f[0][1][1]);
        System.out.println("f[0][1][2] = " + f[0][1][2]);
        System.out.println("f[0][2][0] = " + f[0][2][0]);
        System.out.println("f[0][2][1] = " + f[0][2][1]);
        System.out.println("f[0][2][2] = " + f[0][2][2]);
        System.out.println("f[1][0][0] = " + f[1][0][0]);
        System.out.println("f[1][0][1] = " + f[1][0][1]);
        System.out.println("f[1][0][2] = " + f[1][0][2]);
        System.out.println("f[1][1][0] = " + f[1][1][0]);
        System.out.println("f[1][1][1] = " + f[1][1][1]);
        System.out.println("f[1][1][2] = " + f[1][1][2]);
        System.out.println("f[1][2][0] = " + f[1][2][0]);
        System.out.println("f[1][2][1] = " + f[1][2][1]);
        System.out.println("f[1][2][2] = " + f[1][2][2]);

        //array 3d loop
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                for (int k = 0; k < f[i][j].length; k++) {
                    System.out.println("f[" + i + "][" + j + "][" + k + "] = " + f[i][j][k]);
                }
            }
        }

        //array 3d loop 2
        for (int[][] g : f) {
            for (int[] h : g) {
                for (int i : h) {
                    System.out.println("i = " + i);
                }
            }
        }

        //array 4d ...

    }
}
