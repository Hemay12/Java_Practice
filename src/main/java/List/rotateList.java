package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rotateList {
    public static void main (String [] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //Rotating the list by 2 positions from right
        List<Integer> rightPart  = new ArrayList<> (list.subList(3,5));
        List<Integer> leftPart  =  new ArrayList<> (list.subList(0,3));

        rightPart.addAll(leftPart);
        System.out.println(rightPart);


    }
}
