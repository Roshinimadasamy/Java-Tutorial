package day13oops;
class T {
    T() {
        super();
        System.out.println("print the value T");
    }

    T(int a) {
        this();
        System.out.println("print the value of T" + a);
    }
}
    class Q extends T {
        Q() {

        }

        Q(int a, int b) {

        }

        Q(int a) {
            this();
            System.out.println("print the value of Q" + a);
        }
    }
public class superthisclass {
    public static void main(String[]args){
        Q q=new Q(10);
    }

}
