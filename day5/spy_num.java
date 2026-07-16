package day5;
import java.util.Scanner;

public class spy_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int product = 1;
        while (temp > 0) {
            int pop = temp % 10;
            sum = sum + pop;
            product = product * pop;
            temp = temp / 10;
        }
        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }

    }
}
