package day7;

public class matrix_add {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3,}, {2, 3, 4}, {1, 1, 2}};
        int[][] b = {{1, 2, 3,}, {2, 3, 4}, {1, 1, 2}};
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
            for ( i = 0; i < 3; i++) {
                for (int  j = 0; j < 3; j++) {
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }


        }


    }
}
