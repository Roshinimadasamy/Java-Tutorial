package day10;

public class Stringbuilder {
    public static void main(String[]args){
        StringBuilder name=new StringBuilder("hello");
        name.append(" world");
        //name.insert(3,"roshh");
        name.replace(0,2,"roshh");
        System.out.println(name);
    }
}
