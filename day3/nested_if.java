package day3;
import java.util.Scanner;
public class nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 3 == 0) {
            if (a % 5 == 0) {
                System.out.println("hii");
            }
        }
        else if(a%2==0){
            System.out.println("heee");
        }
        else {
            System.out.println("hloo");
        }
    }
}
