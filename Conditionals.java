public class Conditionals {
    
    public static boolean freshmanTrouble(boolean aSmile, boolean bSmile) {
        boolean Trouble = false;
        if (aSmile != bSmile) 
            Trouble = false;
        
        else 
            Trouble = true;
        
        return Trouble;
    }

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

    public static String setAlarm(int day, boolean onVacation) {
        if (onVacation) {
            
        }
    }
    
    public static void main(String[] args) {
        System.out.println("freshmanTrouble");
        System.out.println(freshmanTrouble(true, true));
        System.out.println(freshmanTrouble(false, false));
        System.out.println(freshmanTrouble(true, false));
        System.out.println(freshmanTrouble(false, true));

        System.out.println("negPos");
        System.out.println(negPos(1, -1, false));
        System.out.println(negPos (-1, 1, false));
        System.out.println(negPos(1, 1, false));
        System.out.println(negPos (-1, -1, false));
        System.out.println(negPos (-4, -5, true));
        System.out.println(negPos (-4, 5, true));
        System.out.println(negPos (4, 5, true));
        System.out.println(negPos (4, -5, true));
        
        System.out.println("pickUpPhone");
        System.out.println(pickUpPhone (false, false, true));
        System.out.println(pickUpPhone (true, true, true));
        System.out.println(pickUpPhone (true, true, false));
        System.out.println(pickUpPhone (false, true, false));
        System.out.println(pickUpPhone (true, false, false));
        System.out.println(pickUpPhone (false, false, false));
    }
}


