import java.util.Scanner;
import java.util.Arrays;
public class PositiveIntSort {
    public static void main(String[] args) {
//        int[] nums = {2, 4, 3, 1, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the positive numbers of elements in the array: ");
        String input = sc.nextLine();
        sc.close();
//        String[] nums = input.split(" ");
        int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
//        int count = Integer.parseInt(nums[0]);
        int count = nums[0];
        int[] nums2 = Arrays.copyOfRange(nums, 1, count + 1);

        Arrays.sort(nums2);

//        System.out.println("Sorted array in from big to small order: ");
        for (int i = nums2.length - 1; i>=0 ; i--) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }

}



//import java.util.Scanner;
//import java.util.Arrays;
//public class PositiveIntSort {
//    public static void main(String[] args) {
////        int[] nums = {2, 4, 3, 1, 5, 6, 7, 8, 9, 10};
//        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the positive numbers of elements in the array: ");
//        String input = sc.nextLine();
//        String[] nums = input.split(" ");
//        String[] nums2 = Arrays.copyOfRange(nums, 1, nums.length);
//        Arrays.sort(nums2);
//
////        System.out.println("Sorted array in from big to small order: ");
//        for (int i = nums2.length - 1; i>=0 ; i--) {
//            System.out.print(nums2[i] + " ");
//        }
//    }
//
//}