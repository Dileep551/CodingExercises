public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(barking && hourOfDay < 8 && hourOfDay >= 0){
            System.out.println(true);
            return true;
        }
        else if(barking && hourOfDay == 23){
            System.out.println(true);
            return true;
        }
        else if (!barking){
            System.out.println(false);
            return false;
        }
        else{
            System.out.println(false);
            return false;
        }
    }

    public static void main(String[] args) {
        shouldWakeUp(true,1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }
}
