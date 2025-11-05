import java.util.Scanner;

public class CrapsGame
{
  private int point;
  private int gamesWon;
  private int totalGames;
/**
 * Constructor
 */
  public CrapsGame(){
    point = 0;
    gamesWon = 0;
    totalGames = 0;
  }
/**
 * Rolls two dice and returns the sum of the dots
 * @return sum of the two dice
 */
  public int rollDice(){
    int die1 = (int)(Math.random() * 6) + 1;
    int die2 = (int)(Math.random() * 6) + 1;
    return die1 + die2;
  }
  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   * 
   * @param total sum of the two dice
   * @return 1 if player won, -1 if player lost, 0 if player continues rolling
   */

  public int processRoll(int total) {
       int result = 0;
     
     if (total == 12 || total == 3 || total == 2 && point == 0) {
        return -1;
     }
     if (total == 11 || total == 7 && point == 0) {
        return 1;
     }
     else if (point == 0) {
        point = total;
     }  
     else if (point == total) {
        return 1;
     }
     else if (point == 7) {
        return -1;
     }
     
       return result;
   }
   /**
    * Prints the current statistics of the game
    */
   public void printCurrentStats(){
    int lost = totalGames-gamesWon;
    System.out.println(gamesWon + " games won " + lost + " games lost.");

   }

  /**
   *  Returns the saved point
   * @return the saved point
   */
  public int getPoint()
  {
    return point;
  }

  /**
   * Plays one round of the Craps game
   * roll the dice, process the roll and update and print the stats
   */
  public void playRound(){
    
    int totalDiceRolled = rollDice();
    System.out.println("You rolled: " + totalDiceRolled);
    int result = processRoll(totalDiceRolled);
    if (result == 1) {
      System.out.println("You win!");
      gamesWon++;
      totalGames++;
      point = 0;
    }
    else if (result == -1) {
      System.out.println("You lose!");
      totalGames++;
      point = 0;
    }
    else {
      System.out.println("Point is: " + point + ". Roll again!");
    }

    

    printCurrentStats();
  }

  /**
   * Plays multiple rounds of the Craps game until the user decides to quit
   * Does a new roll when the user types enter.  q ends the game
   */
  public void playGame(){
    Scanner sc = new Scanner(System.in);
    String continuePlaying = "";
    while (!continuePlaying.equals("q")) {
      playRound();
      continuePlaying = sc.nextLine();
    }

    double winPercent = (double)gamesWon / totalGames * 100;
    System.out.println("You won " + winPercent + "% of the time.");

    sc.close();
  }

  public static void main(String[] args) {
    CrapsGame cg = new CrapsGame();
    cg.playGame();
  }
}
