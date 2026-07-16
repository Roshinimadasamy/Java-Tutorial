package day6;

public class inverted_right {
    public static void main(String[] args) {
        int n = 5;//n*n
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--)
            {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }



