public class FindWeekDay {
    public static void main(String[] args) {
        int day=31;
        int month=8;
        int year=2100;
        String weekDay=dayOfTheWeek(day,month,year);
        System.out.println("Day is :"+weekDay);
    }
    public static String dayOfTheWeek(int day, int month, int year) {
        String[] nonLeapDays = {"Friday", "Saturday","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" };
        String[] leapDays = {"Thursday", "Friday", "Saturday","Sunday", "Monday", "Tuesday", "Wednesday"};
        int[] nonLeapMonthDays = {0,31,59,90,120,151,181,212,243,273,304,334};
        int[] leapMonthDays = {0,31,60,91,121,152,182,213,244,274,305,335};
        String weekDay=null;
        int result=0;
       // if((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))){
            if(year % 4 == 0){
              
            result=(Math.abs(year/4)+year+day+leapMonthDays[month-1])%7;
            System.out.println("innn"+year/4);
            weekDay=leapDays[result];
        }else{
            result=((year/4)+year+day+nonLeapMonthDays[month-1])%7;
            
            weekDay=nonLeapDays[result];
        }
        return weekDay;
    }
    
}
