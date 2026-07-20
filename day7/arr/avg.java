package day7.arr;
import java.util.Scanner;
public class avg {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]id={10,20,30,40,50,60,70,80};
        int length=id.length;
        int sum=0;
        for(int num:id){
            sum+=num;
        }
        float avg=(float)sum/length;
        System.out.println(sum);
        System.out.println(avg);

    }

}
