package day13oops;

 class  R{
     void display() {
         System.out.println("Hello World");
     }
 }
 class O extends R {
     void show() {
         System.out.println("welcome to the world");
     }
 }
 public class single_inheritence{
     public static void main(String[]args){
         R r=new R();
         O o=new O();
         o.show();
         o.display();
     }
}
