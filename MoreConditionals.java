public class MoreConditionals {
    
    public boolean isLeapYear(int year) {
        if (year%4 == 0 && (year%100 != 0 || year%400 ==0)) 
            return true;
        return false;
    }
    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2) {
        if (year1 < year2)
            return true;
        if (year1 == year2) {
            if (month1 < month2) 
            return true;
            if (month1 == month2) {return true;} {
                    if (day1 < day2)
                        return true;
            }
        }
        return false;
    }
    public int findBestFit(int space, int size1, int size2) {
        if (size1 + size2 <= space)
            return 3;
        if (size1 <= space && size2 <= space) {
            if (size1 > size2) {return 1;}
            return 2;
            }
        if (size2 == space) {return 2;}
        if                                          (size1 > space && size2 > space) {return 0;}
        if                                  (size1 > size2) {return 2;}
        return 1;
        }
}
    public boolean makeBenches(int small, int big, int goal) {
        if (goal > small + big) return false;
        if hghhghhghhgh
    }

