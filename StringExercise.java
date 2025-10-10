import java.util.Scanner;

public class StringExercise {
    public static String scroll(String x) {
    int len1 = x.length();
    String f1 = x.substring(0, 1);
    String f2 = x.substring(1,len1);
    return f2 + f1;
    }
    public static String convertName(String y)  {
        int locationComma = y.indexOf(",");
        String g1 = y.substring(0,locationComma);
        String g2 = y.substring(locationComma+1);
        return g2.trim() + " " + g1.trim();
        
    }
    public static String removeSSN(String s) {
        String noSpace = s.replace("-", "");
        return noSpace;
    }
    public static String dateString(String d) {
        int locationSlash1 = d.indexOf("/");
        int locationSlash2 = d.indexOf("/",locationSlash1+1);
        String j1 = d.substring(0,locationSlash1);
        String j2 = d.substring(locationSlash1+1, locationSlash2);
        String j3 = d.substring(locationSlash2+1);
        return j2 + "-" + j1 + "-" + j3;
    }
    public static String negative(String n) {
        String p1 = n.replace("0", "a");
        String p2 = p1.replace("1", "0");
        String p3 = p2.replace("a","1");
        return p3;
    }
   public static void main(String[] args) {

    System.out.println(scroll("Hello World"));
    System.out.println(scroll("happy"));
    System.out.println(scroll("h"));

    System.out.println(convertName(" Reubenstein, Lori Renee  	"));
    System.out.println(convertName("Swift,Taylor"));
    System.out.println(convertName("the Clown, Bozo"));


    System.out.println("123-45-6789 is " + removeSSN("123-45-6789"));

    System.out.println("04/20/2025 becomes " + dateString("04/20/2025"));
    System.out.println("4/2/2025 becomes " + dateString("4/2/2025"));

    
    System.out.println(negative("0010111001"));
    System.out.println(negative("11111111"));

    // nameGame();

   }
}
