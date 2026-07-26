package day13oops;
class car{
    void station(){
        System.out.println("petrol station ");
    }
}
class EVCAR extends car{
    void station(){
        System.out.println("ev station");
    }
}
class PETROL extends car{
    void station(){
        System.out.println(" new petrol station ");
    }
}

public class polymorphism {
    public static void main(String[]args){
        EVCAR evcar=new EVCAR();
        evcar.station();
        PETROL petrol =new PETROL();
        petrol.station();

    }
}
