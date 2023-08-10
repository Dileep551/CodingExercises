public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes >=- 0){
            System.out.println(kiloBytes+" KB = "+ calculateMegabyte(kiloBytes));
        }
        else{
            System.out.println("Invalid Value");
        }

    }

    public static String calculateMegabyte(float kiloBytes){
        int modulerValue = Math.round(kiloBytes % 1024);
        int preModularValue = Math.round(kiloBytes/1024);
        return preModularValue+" MB and "+modulerValue+" KB";
    }

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}
