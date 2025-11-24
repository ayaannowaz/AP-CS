public class WhileLoops {
    public static int addOdds (int n) {
       int num = 1;
       int result = 0;
       while (num <= n) {
        if (num%2 != 0) {
            result += num;
        }
        num +=2;
       }

       return result;
    }
    public static int sumDigits (int skib) {
        int sum = 0;
        int remainder = 10;
        int division = 1;
        while (division <= skib) { 
            sum += (skib%remainder)/division;
            remainder *= 10;
            division *= 10;
        }
        return sum;
    }
    public static int howManyYears (double start, double end) {
        double datRate = 1.0113;
        int dosUnoYears = 0;
        while (start < end) { start *= datRate;
        dosUnoYears +=1;
        }
        return dosUnoYears;
    }
    public static void printSum (int n) {
        int cucusha = 0;
        while (cucusha == 0) {
        int sumThingWrong =(n + (n*(n-1))/2);
        System.out.println(sumThingWrong);
        cucusha ++;
    }
    }
    public static boolean isPerfectSquare(int n) {
    if (n < 0) return false; 

    int first = 1;
    int second = 1;
    int lastButNotLeast = n; 

    while (first < n) { 
        second += 2; 
        first += second;
    }

    return first == lastButNotLeast;
}
    public static void main(String[] args) {
        System.out.println("addOdds");
        System.out.println(addOdds(5));
        System.out.println(addOdds(20));
        System.out.println(addOdds(11));

        System.out.println("");

        System.out.println("sumDigits");
        System.out.println(sumDigits(13));
        System.out.println(sumDigits(600));
        System.out.println(sumDigits(412));

        System.out.println("");

        System.out.println("howManyYears");
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));

        System.out.println("");
        
        System.out.println("printSum");
        printSum(6);
        printSum(8);
        printSum(3);

        System.out.println("");

        System.out.println("isPerfectSquare");
        System.out.println("25: " + isPerfectSquare(25));
        System.out.println("49: " + isPerfectSquare(49));
        System.out.println("3: " + isPerfectSquare(3));
        System.out.println("7: " + isPerfectSquare(7));
    }
}

// addOdds
// 9
// 100
// 36

// sumDigits
// 4
// 6
// 7

// howManyYears
// 7
// 27

// printSum
// 21
// 36
// 6

// isPerfectSquare
// 25: true
// 49: true
// 3: false
// 7: false