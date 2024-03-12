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
//        System.out.print("Enter year interval: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] nums = input.split(" ");
        int yearLeast = Integer.parseInt(nums[0]);
        int yearMost = Integer.parseInt(nums[1]);
        scanner.close();

//        int year = 2020;
        int count = 0;
        for (int year = yearLeast; year <= yearMost; year++) {
            if (isLeapYear(year)) {
                System.out.print(year + " ");
                count ++;
                if (count % 4 == 0) {
                    System.out.println();
            }
        }
    }
}
}
