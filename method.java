public class method {
    public static void modulo(double x, double y){
        double m= x % y;
        System.out.println("Modulo of given numbers: " +m);
    }
    public static void modulo(double a, double b, double c, double d, double e, double y){
        double m1= a % y;
        double m2= b % y;
        double m3= c % y;
        double m4= d % y;
        double m5= e % y;
        System.out.println("Modulo of the given numbers: " +m1+ ", " +m2+ ", " +m3+ ", " +m4+ ", " +m5);


    }

}
public class Main {
    public static void main(String[] args){

            method.modulo(4,5);
            method.modulo(8,7,6,5,4,2);
    }
}
