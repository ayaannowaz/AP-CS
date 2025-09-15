public class ArgsAndReturn{
    public static void main(String[] args) {
        printNumber(467);
        printNumber(-84);
        int a = getLeftOvers(387, 7);
        int b = getLeftOvers(87,4);
        System.out.println(a + "and " + b + " are left over.");

        int c = howManyBoxes(76,12);
        System.out.println("You need " + c + " boxes.");

        System.out.println(makeString("Hello",6));
        double pay = calcWages(18.5, 10);
        double pay2 = calcWages(22.0, 15);
        System.out.println("Pay days " + pay + " " + pay2);

    }
/*
    Prints the number input
    @param number - the nmber you want to print
    @return void
*/

public static void printNumber (int number){
        System.out.println("Printing the number " +number);
}
/*
 gets the remainder value
 @param the dividend
@param the divisor
@return int - the remainder
 */
public static int getLeftOvers (int num, int div){
        int rem = num % div;
        return rem;
    }
    /*
     * determine how many boxes needed to hold num items
     * @param - int numItems, the nymber of items
     * @param - int numPerBox - how many each box holds 
     * @return int - min boxes needed
     */
    public static int howManyBoxes (int numItems, int numPerBox){
        int boxes = numItems/numPerBox + 1;
        return boxes;
    }
public static String makeString(String s, int x){
    String newstr = x + s + x;
    return newstr;
}
 
public static double calcWages(double rate, int hours){
    double w = rate * hours;
    w *=.95; //subtrace taxes
    return w;
}
/* 
 * Create a string from strings and numbers
 * @param String s
 * @param int x
 * @return String - x + s + x
 */
}