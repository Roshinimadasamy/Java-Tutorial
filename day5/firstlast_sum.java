package day5;
import java.util.Scanner;
public class firstlast_sum {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int temp= n;
            int last = temp % 10;
            while (temp >= 10) {
                temp= temp/ 10;
            }
            int first = temp;
            int sum = first + last;
            System.out.println(sum);
        }
    }
