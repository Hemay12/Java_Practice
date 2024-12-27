package String;

public class replace_practice {
    public static void main(String[] args) {

        String str = new String("Java is fun. Java is powerful. Java is awesome.");
        //System.out.println(str);

        String str1 = str.replace("Java", "Python");
        String str2 = str.replaceAll("Java", "Programming");
        String str3 = str.replaceFirst("Java", "Programming");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
