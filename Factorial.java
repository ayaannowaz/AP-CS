public class Factorial {
public static long calcFactorial(long a) {
    for (long track = a-1; track >=1; track--) {
        a*=track;
    }
    return a;
}
public static int calcE() {
    int 
}

public static void main(String[] args) {
    for (int a =1;a<=20;a++) {
        System.out.println(a+ "! = " + calcFactorial(a));
    }

}
}