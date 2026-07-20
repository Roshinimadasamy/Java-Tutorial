package day7;
import java.util.Scanner;
public class array1 {
    public static void main(String[]args){
        //int[] id={10,20,30,40,50,60,70};
        //System.out.println(id[5]);
        Scanner sc=new Scanner(System.in);
        int[]id=new int[5];
        for(int i=0;i<5;i++){
            int a=sc.nextInt();
            id[i]=a;
        }
        System.out.println(id[2]);
    }
}
