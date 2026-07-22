package day10;

public class split {
    public static void main(String[]args){
        String fruits = "Apple,Banana,Orange";
        String[] arr = fruits.split(",");
        for (String fruit : arr) {
            System.out.println(fruit);
        }
    }
}
