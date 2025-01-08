package OOPs;

abstract class Car{

    abstract public void music();

    public void drive(){
        System.out.println("driving");
    }
}

class Tata extends Car{

    @Override
    public void music() {
        System.out.println("Music");
    }

}

class Mahindra extends Car{


    @Override
    public void music() {
        System.out.println("Mahindra music");
    }
}

public class Abstraction {
    public static void main (String [] args){
        Tata tt = new Tata();
        tt.drive();
        tt.music();
    }
}