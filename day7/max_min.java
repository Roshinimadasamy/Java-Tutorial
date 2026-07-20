package day7;
import java.util.Scanner;
public class max_min {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] id={7,8,4,3,9,1,14};
        int max=id[0];
        int min=id[0];
        for(int num:id){
            if(num>max){
                max=num;
            }
            else if(num<min){
                min=num;
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
