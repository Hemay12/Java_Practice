package OOPs;

//Method Overriding in polymorphism

class Animal{
    public void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{

    @Override
    public void sound(){
        System.out.println("Sound of Dog");
    }
}
class Cat extends Animal{

    @Override
    public void sound(){
        System.out.println("Sound of Cat");
    }
}


public class Polymorphism {
    public static void main(String [] args){
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();
    }
}
