import java.util.Scanner;
public class ForLoops {
    public static int addEvens (int n) {
        int aGerasimov = 0;
        for (int a = 0 ; a <= n ; a += 2) {
            aGerasimov +=a;
        }
        return aGerasimov;
    }
    public static void printSquaresBack (int n) {
        double grah = 0;
        for (int apple = n; apple > 0 ; apple -=1) {
            grah = Math.pow(apple, 2);
            System.out.print(grah + ", ");
        }
        System.out.println();
    }
    public static String reverse (String s) {
        String blah = "";
        for (int trials = 0; trials < s.length(); trials++ ) {
            String f1 = s.substring(0, 1);
            String f2 = s.substring(1);
            s = f2 + f1;
            blah = f1 + blah; 
        } 
        return blah;
    }
    public static String stutter (String ogFortnite) {
        String result = "";
        for (int counter = 0; counter < ogFortnite.length(); counter++) {
            result += ogFortnite.charAt(counter);
            result += ogFortnite.charAt(counter);
        }
            return result;
    }

    public static void main(String[] args) {
        System.out.println(addEvens(16));
        System.out.println(addEvens(6));
        System.out.println(addEvens(13));

        printSquaresBack(8);
        printSquaresBack(3);
        printSquaresBack(7);

        System.out.println(reverse("Pikachu"));
        System.out.println(reverse("Krish"));
        System.out.println(reverse("Coffee"));

        System.out.println(stutter("Hello"));
        System.out.println(stutter("Money"));
        System.out.println(stutter("Cabinet"));
    }
}
