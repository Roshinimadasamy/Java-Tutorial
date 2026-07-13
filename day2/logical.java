package day2;
import java.util.Scanner;
public class logical{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean c =(a>10 && a<10);
        System.out.println(c);
        System.out.println(a>10 || a<10);
        System.out.println(!(a>b));
    }
}
