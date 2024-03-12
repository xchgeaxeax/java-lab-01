import java.util.Scanner;
import java.util.Arrays;
public class PositiveIntSort {
    public static void main(String[] args) {
//        int[] nums = {2, 4, 3, 1, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive numbers of elements in the array: ");
        String input = sc.nextLine();
        String[] nums = input.split(" ");

        Arrays.sort(nums);

        System.out.println("Sorted array in from big to small order: ");
        for (int i = nums.length - 1; i>=0 ; i--) {
            System.out.print(nums[i] + " ");
        }
    }

}
