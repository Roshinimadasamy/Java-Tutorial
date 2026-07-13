package day2;
import java.util.Scanner;
public class arithmetic_operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=a+b;
        System.out.println("add:"+c);
        c=a-b;
        System.out.println("sub:"+c);
        c=a*b;
        System.out.println("mul:"+c);
        c=a/b;
        System.out.println("div:"+c);
        c=a%b;
        System.out.println("mod:"+c);
        c=b++;
        System.out.println("inc:"+c);
        c=b--;
        System.out.println("dec:"+c);
    }
}
