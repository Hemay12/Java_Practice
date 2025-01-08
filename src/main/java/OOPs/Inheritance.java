package OOPs;

class Employee{
    String name;
    int id;

    Employee(String name1,int id1){
        this.name = name1;
        this.id =id1;
    }

    void getDetails(){
        System.out.println("Name of the employee is : "+name);
        System.out.println("Name of the id is : "+id);
    }
}

class Emma extends Employee{

    int bonus1;

    Emma(String name1, int id1, int bonus) {
        super(name1,id1);
        this.bonus1 = bonus;
    }

    @Override
    void getDetails(){
        System.out.println("Override getDetgials");
    }

}

class Tema extends Employee{

    Tema(String name1, int id1){
        super(name1 , id1);
    }

    @Override
    void getDetails(){
        super.getDetails();
        System.out.println("Printing parent methods first");
    }
}

public class Inheritance {
    public static void main (String [] args){

        Emma e = new Emma("Alia",34,15000);
        e.getDetails();

        Tema t = new Tema("Baalia",55);
        t.getDetails();

    }
}


