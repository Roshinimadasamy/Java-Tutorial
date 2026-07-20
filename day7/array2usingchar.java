package day7;
import java.util.Scanner;
public class array2usingchar  {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char []id=new char[5];
        for(int i=0;i<5;i++)
        {
            char c=sc.next().charAt(0);
            id[i]=c;
        }
        for(char c:id){
            System.out.println(c);
        }
    }
}
