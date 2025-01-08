package Test;

public class palindrome {
    public static void main(String [] args){

        String s = "hemay";
        palindromed(s);
    }

    private static void palindromed(String s) {
        String str ="";

           for(int i=0;i<s.length();i++){
               str = s.charAt(i)+ str;
           }

           if(s.equals(str)){
               System.out.println("palindrome");
           }
       }
}
