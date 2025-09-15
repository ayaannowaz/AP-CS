public class MathEx {
    public static void main(String[] args) {
    swap(143);
    swap(932);
    swap(469);

    }

public static void swap(int input){
    int a = input;
    int tens = input%10;
    int ones= input%100/10;
    int hundreds = input/100;
    String output = "" + hundreds + tens + ones;
    System.out.println(output);

}

public static void timeLeft() {
    int currentTime = 1230; // Example current time in HHMM format
    int endTime = 1300; // Example end time in HHMM format

    int timeLeft = endTime - currentTime;

    int hoursLeft = timeLeft / 100;
    int minutesLeft = timeLeft % 100;

    System.out.println("Time left: " + hoursLeft + " hours and " + minutesLeft + " minutes");
}
   