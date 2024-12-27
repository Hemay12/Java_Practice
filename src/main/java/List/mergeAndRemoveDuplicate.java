package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mergeAndRemoveDuplicate {
    public static void main (String [] args){

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(3,4,5,6,7);

        List<Integer> merge = new ArrayList<>(list1);
        merge.addAll(list2);
        System.out.println(merge);

        for(int i=0; i<merge.size() ; i++){
            if( merge.indexOf(i) != merge.lastIndexOf(i)){
                merge.remove(merge.lastIndexOf(i));
            }
        }
        System.out.println(merge);

        Collections.reverse(merge);
        System.out.println(merge);
        System.out.println(Collections.max(merge));
        System.out.println(Collections.min(merge));
    }
}
