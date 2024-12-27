package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class frequency {
    public static void main (String[] args){

        List<Integer> newlist = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 1, 3);
        System.out.println(newlist);

        List<Integer> counted = new ArrayList<>();

        for(int i = 0; i < newlist.size(); i++){
            int count =1;
            if (counted.contains(newlist.get(i))) {
                continue;
            }

            for(int j = i+1; j<newlist.size();j++){
                if(newlist.get(i) == newlist.get(j)){
                    count++;
                }
            }
            counted.add(newlist.get(i));
            System.out.println(newlist.get(i) +" count is "+ count);
        }

    }
}
