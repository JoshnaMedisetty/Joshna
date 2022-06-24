public class AreaCalculator {
    public static double area(double r){
        double a= r*r*Math.PI;
        return a;
    }
    public static double area(double l, double b){
        if(l>=0 && b>=0){
            double x= l*b;
            return x;

        }
        else{
            return -1;
        }
    }

}
public class Main {
    public static void main(String[] args){
        AreaCalculator.area(3);
        AreaCalculator.area(4,5);
    }
}
