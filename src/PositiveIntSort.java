import java.util.Scanner;
import java.util.Arrays;
public class PositiveIntSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = nums[0];
        int[] nums2 = Arrays.copyOfRange(nums, 1, count + 1);
        Arrays.sort(nums2);
        for (int i = nums2.length - 1; i>=0 ; i--) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }

}
