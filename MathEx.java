public class MathEx {
    public static void main(String[] args) {
    int input = 123;
		int output = swap(input);
		System.out.println(output);
		
		input = 6;
		output = swap(input);
		System.out.println(output);
		
		input = 381;
		output = swap(input);
		System.out.println(output);

		timeLeft(1,34, 8, 20);
		timeLeft(1,15, 4, 36);
		
		System.out.println(daysOfWeek(0,1));
		System.out.println(daysOfWeek(0,14));
		System.out.println(daysOfWeek(6, 22));
		System.out.println(daysOfWeek(5, 4));
		System.out.println(daysOfWeek(1,24));
		System.out.println(daysOfWeek(2,1));
    }
/* Swaps the tens and ones digits of at most a 3-digit integer.
 * @param-int int input - an integer between 0 and 999
 * @return int - the integer formed by swapping the ones and tens place of a 3-digit integer
*/
public static int swap(int input){
    int tens = (input%10)*10;
    int ones= input%100/10;
    int hundreds = (input/100)*100;
    return hundreds + tens + ones;

}
/* Defines the time left between the current time in hours and minutes and a departure time in hours and minutes.
 * @param - int curHour - the current hour
 * @param - int curMin - the current minute
 * @param - int depHour - the departure hour
 * @param - int depMin - the departure minute
 * @return - void - prints the time left in hours and minutes
 */
public static void timeLeft(int curHour, int curMin, int depHour, int depMin){ {
    int curTotalMin = curHour*60 + curMin;
    int depTotalMin = depHour*60 + depMin;
    int leftMin = depTotalMin - curTotalMin;
    int leftHour = leftMin/60;
    leftMin = leftMin%60;
    System.out.println("Time left: " + leftHour + " hours and " + leftMin + " minutes.");

}
}
/* Determines the day of the week given the day of the week of January 1st and the day of the year.
 * @param - int Jan1 - the day of the week that January 1st falls on. Ex. 0 = Sunday, 1 = Monday, etc.
 * @param - int day - the day of the month 
 * @return - int - the day of the week that the given day falls on. Ex. 0 = Sunday, 1 = Monday, etc.
 */
public static int daysOfWeek(int Jan1, int day){
    int answer = (day-1 + Jan1)%7;
    return answer;
}
}

/*
132
60
318
Time left: 6 hours and 46 minutes.
Time left: 3 hours and 21 minutes.
0
6
6
1
3
2
*/
