package List;

import java.util.ArrayList;
import java.util.List;

public class removeDuplicate {
    public static void main(String [] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println(list);

        for(int i=0; i<list.size() ; i++){
            if( list.indexOf(i) != list.lastIndexOf(i)){
                list.remove(list.lastIndexOf(i));
            }
        }
        System.out.println(list);

    }
}
