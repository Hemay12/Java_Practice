package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listMethods {
    public static void main (String []args){

//        addRemove();
//        setToReplaceAndGet();
//        sizeList();
//        containsw();
//        indexOfMethod();
//        clearAndEmpty();
//        toArrayExample();
//        sortMethod();
        subListMethod();
//        retainAllMethod();
//        removeAllMethod();
//        addAllMethod();
//        equalsMethod();
    }

    private static void equalsMethod() {
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("Cherry");

        List<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Cherry");

        System.out.println("Are the two lists equal? " + fruits1.equals(fruits2));
        fruits2.add("Mango");
        System.out.println("Are the two lists equal? " + fruits1.equals(fruits2));
    }

    private static void addAllMethod() {
        List<String> list = new ArrayList<>();
        list.add("Cherry");
        list.add("Banana");
        list.add("Apple");
        System.out.println(list);

        List<String> list_new = Arrays.asList("Apple","Mango");
        list.addAll(list_new);
        System.out.println(list);
    }

    private static void removeAllMethod() {
        List<String> list = new ArrayList<>();
        list.add("Cherry");
        list.add("Banana");
        list.add("Apple");
        System.out.println(list);

        List<String> list_new = Arrays.asList("Apple");
        list.removeAll(list_new);
        System.out.println(list);

    }

    private static void retainAllMethod() {
        List<String> list = new ArrayList<>();
        list.add("Cherry");
        list.add("Banana");
        list.add("Apple");

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("NO");
        fruits.add("NO");

        List<String> fruit = Arrays.asList("Banana", "Mango", "Orange");

        list.retainAll(fruits);
        System.out.println(list);
//        fruit.retainAll(list);
//        fruits.retainAll(list);
        System.out.println(fruits);
    }

    private static void subListMethod() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);
        List<String> subList = fruits.subList(1,4);
        System.out.println(subList);

    }

    private static void sortMethod() {
        List<String> list = new ArrayList<>();
        list.add("Cherry");
        list.add("Banana");
        list.add("Apple");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void toArrayExample() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        String arr[] = list.toArray(new String[0]);

        for(String s : arr){
            System.out.println(s);
        }
    }

    private static void clearAndEmpty() {
        List<String> list = new ArrayList<>();
        list.add("Muskmelon");
        list.add("Banana");
        System.out.println("List is Empty  "+ list.isEmpty());

        list.clear();
        System.out.println(list);

        System.out.println("Lisr is Empty "+ list.isEmpty());

    }

    private static void indexOfMethod() {
        List<String> list = new ArrayList<>();
        list.add("Muskmelon");
        list.add("Banana");
        list.add("Apple");
        list.add("Banana");

        System.out.println(list.indexOf("Muskmelon"));
        System.out.println(list.indexOf("NOT"));

        System.out.println("Last Index "+list.lastIndexOf("Banana"));
    }

    private static void containsw() {
        List<String> list = new ArrayList<>();
        list.add("Muskmelon");
        list.add("Banana");

        System.out.println(list.contains("Apple"));
    }

    private static void sizeList() {
        List<String> list = new ArrayList<>();
        list.add("Muskmelon");
        list.add("Banana");
        System.out.println(list.size());  // true OR false

    }

    private static void setToReplaceAndGet() {
        List<String> list = new ArrayList<>();
        list.add("Muskmelon");
        list.add("Banana");
        list.add("Apple");
        System.out.println(list);
        list.set(0,"Replaced");
        System.out.println(list);

        System.out.println(list.get(2));
    }

    private static void addRemove(){
        List<String> list = new ArrayList<>();
        list.add("Muskmelon");
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Apple");
        list.add(0, "Cherry"); // Adding element at index 0
        System.out.println(list);

        list.remove(2);
        System.out.println("List after removing element at index 2: "+list);

        list.remove("Apple");
        System.out.println("List after removing 'Apple': "+list);
    }


}
