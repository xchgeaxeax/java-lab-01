import java.util.Scanner;

public class LeapYearCalculate {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
//        int year = 2020;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
