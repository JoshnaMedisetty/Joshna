public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");

        } else {

            int m = kiloBytes / 1024;
            int k = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + m + " MB + " + k + " KB ");
        }
    }
}
public class main {

    public static void main (String[] args){

        MegaBytesConverter.printMegaBytesAndKiloBytes

    }

}

