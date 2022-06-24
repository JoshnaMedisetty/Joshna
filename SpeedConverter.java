public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour <0){
            System.out.println("Invalid value");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h =" + milesPerHour + "mi/h");
        }
    }
}
public class Main {

    public static void main(String[] args) {

        double kilometersPerHour;
        double miles = SpeedConverter.toMilesPerHour(kilometersPerHour 10.5);
            System.out.println("Miles =" +miles);

            SpeedConverter.printConversion(kilometersPerHour 10.5);
    }
}

