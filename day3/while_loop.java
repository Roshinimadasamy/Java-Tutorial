package day3;
import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }
}

