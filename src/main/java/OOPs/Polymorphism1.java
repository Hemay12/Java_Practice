package OOPs;

class Vehicle{

    public void carName(String name1){
        System.out.println("Fastest car is : " + name1);
    }

    public void carName(String name1, String model){
        System.out.println("Model "+ model +" of "+ name1+" is fastest car");
    }
}

public class Polymorphism1 {
    public static void main (String [] args){
        Vehicle vhi = new Vehicle();
        vhi.carName("Mercedes");
        vhi.carName("BMW","Nano");
    }
}
