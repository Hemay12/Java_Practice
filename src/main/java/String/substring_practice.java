package String;

public class substring_practice {
    public static void main(String[] args){

        String str = new String("Original");
        System.out.println(str);

        String str1 = str.substring(3);  // Here the index starts from 0
        System.out.println(str1);

        String str2 = str.substring(0,3);

        //****************  Concating strings below ******************

        String str_new = new String("try to con");
        String str4 = new String("cat");

        String result = str_new.concat(str4);
        System.out.println(result);

        // ************** Case Sensitivity *******************

        String str_abc = new String("lower to upper");
        str_abc = str_abc.toUpperCase();
        System.out.println(str_abc);

        String str_xyz = new String("UPPER TO LOWER");
        str_xyz = str_xyz.toLowerCase();
        System.out.println(str_xyz);

        trim();
        equals();
        character();
        contains();
    }

    public static void trim(){
        String str_12 = new String("   Hello World    ");
        str_12 = str_12.trim();
        System.out.println(str_12);
        String str13 = str_12.replace(" ","");
        System.out.println(str13);
    }

    public static void equals(){
        String str14 = new String("hello");
        String str15 = new String("Hello");

        boolean x = str14.equals(str15);
        System.out.println(".Equals used "+x);
        boolean y = str14.equalsIgnoreCase(str15);
        System.out.println(".equalsIgnoreCase used "+ y);

        String str111 = "Apple";
        String str222 = "apples";  //It is case-sensitive
        int result12 = str111.compareTo(str222); // Negative value if the current string is lexicographically smaller than anotherString.
        System.out.println(result12);

        int result13 = str111.compareToIgnoreCase(str222); //Similar to compareTo, but ignores case differences during comparison.
        System.out.println(result13);
    }

    public static void character(){
        String str16 = new String("Character position check");
        char a = str16.charAt(0);
        System.out.println(a);
        char last_character = str16.charAt(str16.length()-1);
        System.out.println(last_character);

        System.out.println(str16.indexOf(last_character));
        System.out.println(str16.indexOf("a",3));
        System.out.println(str16.indexOf("position",3)); //indexing starts from 0

        System.out.println(str16.lastIndexOf("e"));
        System.out.println(str16.lastIndexOf("e",4)); //-1 if the character is not found
        System.out.println(str16.lastIndexOf("check"));
    }

    public static void contains(){
        String str21 = "Java is fun and powerful";
        if(str21.contains("java")){
            System.out.println("contains java");
        }
        if(str21.contains("difficult")){
        }
        else{
            System.out.println("String does not contain difficult");
        }
    }
}


