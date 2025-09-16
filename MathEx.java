public class MathEx {
    public static void main(String[] args) {
    swap(143);
    swap(932);
    swap(469);
    timeLeft(1, 15, 4, 36);
    timeLeft(1, 34, 8, 20);
    }

public static void swap(int input){
    int a = input;
    int tens = input%10;
    int ones= input%100/10;
    int hundreds = input/100;
    String output = "" + hundreds + tens + ones;
    System.out.println(output);

}

public static void timeLeft(int curHour, int curMin, int depHour, int depMin){ {
    int curTotalMin = curHour*60 + curMin;
    int depTotalMin = depHour*60 + depMin;
    int leftMin = depTotalMin - curTotalMin;
    int leftHour = leftMin/60;
    leftMin = leftMin%60;
    System.out.println("Time left: " + leftHour + " hours and " + leftMin + " minutes.");

}
}
}