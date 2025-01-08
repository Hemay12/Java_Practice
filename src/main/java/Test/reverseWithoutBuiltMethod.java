package Test;

public class reverseWithoutBuiltMethod {

    public static void main (String [] args){

        String s = "Hemay";
        revers(s);
    }

    private static void revers(String s) {
        char [] arr = s.toCharArray();
//        String reversed = "";
        StringBuilder sb =new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
