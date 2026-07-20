package day7;
import java.util.Scanner;
public class even_sum_odd_sum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] id={7,8,4,3,9,1,14};
        int evensum=id[0];
        int oddsum=id[0];
        for(int num:id){
            if(num%2==0){
                evensum+=num;
            }
            else {
                oddsum+=num;
            }

        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
