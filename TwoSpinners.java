public class TwoSpinners {
 	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
 	public int spin(int min, int max)
 	{
        int apple = (int)(Math.random()*(max - min + 1) + min);
        return apple;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
   	    int cSpin1 = spin(2, 8);
        int pSpin1 = spin(1,10);
         int diff1 = cSpin1 - pSpin1;
         int diff2 = pSpin1 - cSpin1;
        if (pSpin1 > cSpin1) {
    System.out.println("You Win! " + (pSpin1 - cSpin1) + " points");
} else if (cSpin1 > pSpin1) {
    System.out.println("You Lose. " + (cSpin1 - pSpin1) + " points");
} else { // tie
    int cSpin2 = spin(2,8);
    int pSpin2 = spin(1,10);
    int totalP = pSpin1 + pSpin2;
    int totalC = cSpin1 + cSpin2;
    if (totalP > totalC) {
        System.out.println("You Win! 1 point(s)");
    } else if (totalC > totalP) {
        System.out.println("You Lose. -1 point(s)");
    } else {
        System.out.println("Tie. 0 points");
    }
}
        }  	

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playRound 10 times
         		ds.playRound();
     	      }
}
}

// You Win! 1 points
// You Win! 2 points
// You Win! 8 points
// You Lose. 5 points
// You Win! 2 points
// Tie. 0 points
// You Lose. -1 point(s)
// You Win! 2 points
// You Win! 1 points
// You Lose. 2 points