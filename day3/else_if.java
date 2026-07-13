package day3;
import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if(a != b){
            System.out.println(" Not Equal");
        }

    }
}
