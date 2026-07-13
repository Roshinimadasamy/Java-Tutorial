package day2;
import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eng= sc.nextInt();
        int math= sc.nextInt();
        int sci= sc.nextInt();
        int bio = sc.nextInt();
        int phy = sc.nextInt();
        float avg=(eng+math+sci+bio+phy)/5;
        System.out.println(avg);
    }
}

