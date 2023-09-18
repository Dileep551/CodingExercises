public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 11));
    }

    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;
        } else return number > 0 && number % 2 != 0;

    }

    public static int sumOdd(int start, int end) {


        int value = 0;
        if (start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {

                if(isOdd(i)){

                    value += i;
                }

                return value;

            }
        } else return -1;

        return -1;
    }

}