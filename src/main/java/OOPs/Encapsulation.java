package OOPs;

class Customer{

    Customer(String name2, int age1){
        this.name = name2;
        this.age = age1;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class Encapsulation {
    public static void main (String [] args){
        Customer cust = new Customer("Lalu",33);
        cust.setAge(43);
        cust.setName("Balu");

        System.out.println(cust.getAge());
        System.out.println(cust.getName());

    }
}
