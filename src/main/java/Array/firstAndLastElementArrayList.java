package Array;

import java.util.ArrayList;

public class firstAndLastElementArrayList {
    public static void main (String [] args){

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        if(!list.isEmpty()){
            System.out.println("First Element : " + list.get(0));
            System.out.println("Last Element : " + list.get(list.size()-1));
        }
    }
}
