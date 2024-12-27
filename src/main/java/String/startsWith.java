package String;

public class startsWith {
    public static void main(String args[]){
        String str = new String("Java Programming");
        boolean result = start(str);
        boolean result2 = ends(str);
        System.out.println("Starts with Java: " + result + ", Ends with Java: " + result2);

        String message = String. join("-", "Java", "is", "cool");
        System.out.println(message);

        boolean x = message.isEmpty();
        System.out.println(x);

        String repeat = message.repeat(2);
        System.out.println(repeat);

        int a = "Aava".codePointAt(0);
        System.out.println(a);
    }

    public static boolean start(String str1){
        if(str1.startsWith("Java")){
            return true;
        }
        else{ return false;}
    }

    public static boolean ends(String str1){
        if(str1.endsWith("Java")){
            return true;
        }
        else{ return false;}
    }

}
