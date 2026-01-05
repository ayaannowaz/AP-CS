public class GradeAverage {

	private int [] scores;
	/**
	 * GradeAverage constructor
	 * @param int []  an array of integer representing 
	 * an ordered list of grades
	 */
	public GradeAverage(int [] s)
	{
		scores = s;
	}
	/** returns the mean (average) of the values in the scores array
	* whose indexes are between first and last.  You may assume that
	* first and last are > 0 and < scores.length
	* @param first - index of the first value to be averaged
	* @param last - index of the last value to be averaged
	* @return double - the average
	*/
	private double mean(int first, int last)
	{
		double meanReturned = 0;
        for (int initial = first; initial <= last; initial++) {
            meanReturned += scores[initial];
        }
        meanReturned /= (last - first + 1);
		return meanReturned;
	}
	
	/** returns true if each successive value in scores is greater than
	* or equal to the previous value.  Otherwise returns false
	* @return boolean 
	*/
	private boolean showsImprovement()
	{
		for (int initial = 0; initial < scores.length - 1; initial++) {
            if (scores[initial] > scores[initial+1]) {
                return false;
            }
        }
		return true;
	}
	
	/** if the values in the scores array show improvement, returns the
	* average of the elements in scores with indexes greater than or
	* equal to scores.length()/2
	* @return double - the final adjusted average
	*/
	public double finalGrade()
	{
        if (showsImprovement() == true){
            return mean(scores.length/2, scores.length-1);
        }
    
        else {
            return mean(0, scores.length-1);
        }
    
    }
	public static void main(String[] args) {
		int [] s1 = {50,50,20,80,53};   // not improved, finalGrade is 50.6
		int [] s2 = {20,50,50,53,80};   // improved, final grade is 61.0
		int [] s3 = {20,50,50,80};      // improved, final grade is 65.0
		int [] s4 = {35, 50, 45, 60,62};  // not improved, finalGrade is 50.4
		int [] s5 = {47, 58, 58, 66, 87, 90,90,90};  // improved, final grade is 89.25
		GradeAverage sr1 = new GradeAverage(s1);
		System.out.println(sr1.mean(1,3));
		System.out.println(sr1.showsImprovement());
		System.out.println(sr1.finalGrade());
		GradeAverage sr2 = new GradeAverage(s2);
		System.out.println(sr2.mean(2,4));
		System.out.println(sr2.showsImprovement());
		System.out.println(sr2.finalGrade());
		GradeAverage sr3 = new GradeAverage(s3);
		System.out.println(sr3.mean(0,2));
		System.out.println(sr3.showsImprovement());
		System.out.println(sr3.finalGrade());
		GradeAverage sr4 = new GradeAverage(s4);
		System.out.println(sr4.showsImprovement());
		System.out.println(sr4.finalGrade());
		GradeAverage sr5 = new GradeAverage(s5);
		System.out.println(sr5.showsImprovement());
		System.out.println(sr5.finalGrade());	
	}
}

// 50.0
// false
// 50.6
// 61.0
// true
// 61.0
// 40.0
// true
// 65.0
// false
// 50.4
// true
// 89.25