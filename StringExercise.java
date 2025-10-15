import java.util.Scanner;
// moves the first character of a string to the end of the string and returns it
// @param 
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
    public static void nameGame() {
        Scanner sc = new Scanner (System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        sc.close();
        
        int locationSpace = name.indexOf(" ");
        String firstName = name.substring(0,locationSpace);
        String lastName = name.substring(locationSpace + 1, name.length());
        String firstNameR = firstName.substring(1);
        String lastNameR = lastName.substring(1);
        String firstNameUp = firstName.toUpperCase();
        String lastNameUp = lastName.toUpperCase();
        System.out.println(firstName + ", " + firstName + ", bo-B" + firstNameR);
        System.out.println("Banana-fana fo-F" + firstNameR);
        System.out.println("Fee-fi-fo-M" + firstNameR);
        System.out.println(firstNameUp +"!");
        System.out.println("");
        System.out.println(lastName + ", " + lastName + ", bo-B" + lastNameR);
        System.out.println("Banana-fana fo-F" + lastNameR);
        System.out.println("Fee-fi-fo-M" + lastNameR);
        System.out.println(lastNameUp +"!");


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

    nameGame();

   }
}

// ello WorldH
// appyh
// h
// Lori Renee Reubenstein
// Taylor Swift
// Bozo the Clown
// 123-45-6789 is 123456789
// 04/20/2025 becomes 20-04-2025
// 4/2/2025 becomes 2-4-2025
// 1101000110
// 00000000
// What is your name?
// Fifty Cent
// Fifty, Fifty, bo-Bifty
// Banana-fana fo-Fifty
// Fee-fi-fo-Mifty
// FIFTY!

// Cent, Cent, bo-Bent
// Banana-fana fo-Fent
// Fee-fi-fo-Ment
// CENT!