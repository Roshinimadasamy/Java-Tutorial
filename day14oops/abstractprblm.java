package day14oops;
abstract class employeee {
    protected int id;
    protected String name;
    protected int basesalary;

    employeee(int id, String name, int basesalary) {
        this.id = id;
        this.name = name;
        this.basesalary = basesalary;
    }

    abstract void bonus();
}
class manager extends employeee{
    manager(int id,String name,int basesalary){
        super(id,name,basesalary);
    }
    void bonus(){
        System.out.println("id: "+id+" name: "+name +" basesalary: "+basesalary*0.5);
    }
}
class developer extends manager{
    developer(int id,String name,int basesalary){
        super(id,name,basesalary);
    }
    void bonus(){
        System.out.println("id: "+id+ " name: "+name + " basesalary: " +basesalary*0.1);
    }
}
class intern extends developer{
    intern(int id,String name,int basesalary) {
        super(id, name, basesalary);
    }
    void bonus(){
        System.out.println("id: "+ id+ " name: "+name+ " basesalary: "+basesalary);
    }
}
public class abstractprblm {
    public static void main(String[] args) {
        employeee m = new manager(105, "roshh", 50000);
        employeee d = new developer(200, "vani", 30000);
        employeee i = new intern(300, "yash", 1000);
        m.bonus();
        d.bonus();
        i.bonus();
    }
}