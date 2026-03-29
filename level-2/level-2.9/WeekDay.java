public class WeekDay {
    public static void main(String[] args) {

        int num = 6;
        System.out.println("The nuber is " + num);

        switch (num) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("This number contains weekday!");
                break;
            case 6:
            case 7:
                System.out.println("This number contains weekend!");
                break;
            default:
                System.out.println("This number exceeds week numbers, week number is from 1 to 7");
        }
         
    }
}
