package day3;
import java.util.Scanner;
public class swt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        switch (a) {
            case 1:
            System.out.println("sunday");
            break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tue");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("thur");
                break;
            case 6:
                System.out.println("fri");
                break;
            case 7:
                System.out.println("sat");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

