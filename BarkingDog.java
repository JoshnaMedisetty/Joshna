public class BarkingDog {

    public static void shouldWakeUp(boolean Barking, int hourOfDay){
        if (Barking == true){
            if (hourOfDay < 8 || hourOfDay > 22){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

        }
        else{
            System.out.println("false");

        }
    }

}
public class main {
    public static void main(String[] args){
        BarkingDog.shouldWakeUp(true,4);
    }
}
