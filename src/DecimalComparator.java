public class DecimalComparator {


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

//        System.out.println((double)Math.round(num1 * 1000d));
//        System.out.println((double)Math.round(num2 * 1000d));

        if(Math.round(num1 * 100d)/100d == Math.round(num2 * 100d)/100d) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }


    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.146, -3.1456);
        areEqualByThreeDecimalPlaces(3.146, 3.14678);
    }
}
