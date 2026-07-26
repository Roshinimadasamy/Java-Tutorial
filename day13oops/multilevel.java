package day13oops;
class  U{
    void display() {
        System.out.println("Hello World");
    }
}
class V extends U {
    void show() {
        System.out.println("welcome to the world");
    }
}
class W extends V{
    void fly(){
        System.out.println("hiiii world");
    }
}
public class multilevel {
    public static void main(String[]args){
        U u=new U();
        V v=new V();
        W w =new W();
        v.display();
        w.fly();
        w.display();
        w.show();
    }
}
