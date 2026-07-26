package day13oops;
class  A {
    void display() {
        System.out.println("Hello World");
    }
}
class B extends A {
    void show() {
        System.out.println("welcome to the world");
    }
}
class C extends A{
    void fly(){
        System.out.println("hiiii world");
    }
}
public class multiple_inheritance{
    public static void main(String[]args){
        A a=new A();
        B b=new B();
        C c=new C();
        b.show();
        b.display();
        c.fly();
        c.display();
    }
}
