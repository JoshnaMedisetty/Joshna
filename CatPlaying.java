public class CatPlaying {
    public static void isCatPlaying(boolean summer, int temperature){
        if(summer=true){
            if(temperature>=25 && temperature <= 45){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        if(summer=false)
        {
            if(temperature>=25 && temperature <=35){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }

    }
}
public class main {
    public static void main(String[] args){
        CatPlaying.isCatPlaying(false,45);
    }
}
