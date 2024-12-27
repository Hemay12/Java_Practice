package String;

public class reverseIn5ways {
    public static void main(String args[]){
        //1. Use StringBuilder
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        String reverse1 = sb.reverse().toString();
        System.out.println(reverse1);
        System.out.println("*********************************");

        //2. Use a for loop
        String reverse2 = "";
        for(int i = str.length()-1; i >=0; i--){
            reverse2 = reverse2 + str.charAt(i);
        }
        System.out.println(reverse2);
        System.out.println("*********************************");

        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb1.append(i);
        }
        String result = sb1.toString();
        System.out.println(result);
    }
}
