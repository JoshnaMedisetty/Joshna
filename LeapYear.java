public class LeapYear {

    public static void isLeapYear(int year){
        if (year > 0 && year < 9999 ){
            if(year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("true");
                    } else
                        System.out.println("false");
                } else
                    System.out.println("true");
            }
            else
                System.out.println("false");
        }
        else
            System.out.println("false");
    }
}
public class Main {
    public static void main (String[] args){

        LeapYear.isLeapYear(2001);
    }
}
