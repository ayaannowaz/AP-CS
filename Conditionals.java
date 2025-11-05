public class Conditionals {
    // Tells whether or not one is in "Trouble" based on if both students are smiling or not.
    // @param - boolean aSmile: the first student smiling or not
    // @param - boolean bSmile: the second student smiling or not
    // @return - Returns true if in trouble
    public static boolean freshmanTrouble(boolean aSmile, boolean bSmile) {
        boolean Trouble = false;
        if (aSmile != bSmile) 
            Trouble = false;
        
        else 
            Trouble = true;
        
        return Trouble;
    }
    // Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
    // @param - int a: First integer value
    // @param - int b: Second integer value
    // @param  - boolean negative: if true, then only returns true if both integer values are negative
    // reutrns true if one out of two integer values are negative, unless boolean negative is true, in which case returns true when both values are negative
    public static boolean negPos(int a, int b, boolean negative) {
        if (a < 0 && b < 0 && negative) {
            return true; 
        }
        if ((a < 0 && b > 0 || a > 0 && b < 0) && !negative) {
            return true;
        }
        else {
        return false;
        }
    }
    // Returns true if one should answer the phone based on the circumstances
    // @param - boolean isMorning: Designates whether or not the instance is during the morning
    // @param - boolean isMom: Designates whether or not the instance is one's mom calling
    // @param - booleanIsAsleep: Desigmates whether or not one is asleep during the instance
    // @return - Returns true if one will answer the phone, returns false if one will not answer the phone
    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning) {
            if (isMom) {
                return true;
            }
            else 
                return false;
        }
        else
            return true;
    }
    // Sets alarm based on the circumstances
    // @param - int day: Designates what day of the week the instance falls on
    // @param - boolean onVacation: Designates whether or not one is on vacation during instance
    // @return - Returns alarm time or if there is no alarm based on parameters
    public static String setAlarm(int day, boolean onVacation) {
        if (onVacation) {
            if (day >= 1 && day <= 5) {
                return "10:00";
            }
            else {
                return "off";
            }
        }
        else {
            if (day >= 1 && day <= 5) {
                return "7:00";
            }
            else {
                return "10:00";
            }
        }
    }
    // Returns true if two or more of the three digit integers have the same rightmost digit
    // @param - int la: integer 1
    // @param - int di: integer 2
    // @param - int da: integer 3
    // @return - returns true if conditions are met, returns false if not
    public static boolean onesDigitSame (int la, int di, int da) {
        la = la%10;
        di = di%10;
        da = da%10;

        if (la == di || la == da || di == da) {
            return true; }
        else {
            return false;
        }
    }
    // Returns value closest to 21 that does not exceed 21
    // @param - int ya: card value 1
    // @param - int yeet: card value 2
    // @return - returns the highest card value that does not exceed 21 or 0 if both exceed 21
    public static int blackjack(int ya, int yeet) {
        if (ya > 21 && yeet > 21) {
            return 0;
        }

        if (ya > 21) {
            return yeet;
        }

        if (yeet > 21) {                
            return ya;
        }

        if (ya > yeet) {
            return ya;
        }
        else {
            return yeet;
        }
    }
    // Returns "Pop", "Bang", or "PopBang" based on what characters are in the string
    // @param - String apple: String to be considered by method
    // @return - Returns "Pop" if string starts with "P", returns "Bang" if string ends with "B" and if both conditions are met, returns "PopBang", string is unchanged in all other cases
    public static String popBang(String apple) {
        String one = apple.substring(0,1);
        String last = apple.substring(apple.length()-1);
        if (one.equals("p") && last.equals("b")) {
            return "PopBang"; 
        }
        if (one.equals("p")) {
            return "Pop";
        }
        if (last.equals("b")) {
            return "Bang";
        }
        else 
            return apple;
    }

    public static void main(String[] args) {
        System.out.println("freshmanTrouble");
        boolean fa = freshmanTrouble(true, true);
        boolean fb = freshmanTrouble(false, false);
        boolean fc = freshmanTrouble(true, false);
        boolean fd = freshmanTrouble(false, true);
        System.out.println(fa + " " + fb + " " + fc + " " + fd);

        System.out.println("");
        
        System.out.println("negPos");
        boolean na = negPos(1, -1, false);
        boolean nb = negPos(-1, 1, false);
        boolean nc = negPos(1, 1, false);
        boolean nd = negPos(-1, -1, false);
        boolean ne = negPos(-4, -5, true);
        boolean nf = negPos(-4, 5, true);
        boolean ng = negPos(4, 5, true);
        boolean nh = negPos(4, -5, true);
        System.out.println(na + " " + nb + " " + nc + " " + nd + " " + ne + " " + nf + " " + ng + " " + nh);

        System.out.println("");

        System.out.println("pickUpPhone");
        boolean pa = pickUpPhone(false, false, true);
        boolean pb = pickUpPhone(true, true, true);
        boolean pc = pickUpPhone(true, true, false);
        boolean pd = pickUpPhone(false, true, false);
        boolean pe = pickUpPhone(true, false, false);
        boolean pf = pickUpPhone(false, false, false);
        System.out.println(pa + " " + pb + " " + pc + " " + pd + " " + pe + " " + pf);

        System.out.println("");

        System.out.println("setAlarm");
        String aa = setAlarm(1, false);
        String ab = setAlarm(5, false);
        String ac = setAlarm (0, false);
        String ad = setAlarm (2, true);
        String ae = setAlarm (4, true);
        String af = setAlarm (6, true);
        System.out.println(aa + " " + ab + " " + ac + " " + ad + " " + ae + " " + af);

        System.out.println("");

        System.out.println("onesDigitSame");
        boolean oa = onesDigitSame(23, 19, 13);
        boolean ob = onesDigitSame (23, 19, 12);
        boolean oc = onesDigitSame (23, 19, 3);
        boolean od = onesDigitSame (423, 13, 3);
        boolean oe = onesDigitSame (23, 29, 25);
        System.out.println(oa + " " + ob + " " + oc + " " + od + " " + oe);

        System.out.println("");

        System.out.println("blackjack");
        int ba = blackjack(19, 21);
        int bb = blackjack(21, 19);
        int bc = blackjack(19, 22);
        int bd = blackjack(8, 8);
        int be = blackjack(25, 24);
        int bf = blackjack(17, 9);
        int bg = blackjack(12,18);
        System.out.println(ba + " " + bb + " " + bc + " " + bd + " " + be + " " + bf + " " + bg);

        
        String p2a = popBang("party");
        String p2b = popBang("glob");
        String p2c = popBang("plumb"); 
        String p2d = popBang("hello"); 
        System.out.println(p2a + " " + p2b + " " + p2c + " " + p2d);
    }
}

// freshmanTrouble
// true true false false

// negPos
// true true false false true false false false

// pickUpPhone
// false false true true false true

// setAlarm
// 7:00 7:00 10:00 10:00 10:00 off

// onesDigitSame
// true false true true false

// blackjack
// 21 21 22 8 0 17 18                
// Pop Bang PopBang hello



