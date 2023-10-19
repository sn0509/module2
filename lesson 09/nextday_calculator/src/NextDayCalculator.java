public class NextDayCalculator {

    public static int nextDayCalculator (int day, int month, int year) {

        if (day == 31 && month ==12){
            return year++;
        }else if (isLeapYear(year)){
            if (day == 29 && month == 2){
                return day=1;
            }
        }

    }

    public static boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                return year % 400 == 0;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

}
