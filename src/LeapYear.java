public class LeapYear {

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
                if(year % 4 == 0){
                    if(year % 100 == 0){
                        if( year % 400 == 0){
                            System.out.println("true");
                            return true;
                        }
                        else {
                            System.out.println("false");
                            return false;
                        }
                    }
                    else {
                        System.out.println("true");
                        return true;
                    }

                } else{
                    System.out.println("false");
                    return false;

                }
        }
        else{
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
    }


}