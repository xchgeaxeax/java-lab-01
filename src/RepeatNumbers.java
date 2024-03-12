import java.util.Scanner;
public class RepeatNumbers {
    public static void main(String[] args){
        System.out.println("Enter repeat times, must more than 0 and less than 10");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split(" ");
        int repeat = Integer.parseInt(nums[0]);
        long a = Integer.parseInt(nums[1]);
        long n = Integer.parseInt(nums[2]);
        sc.close();
// check repeat is valid or not
        if(repeat <= 0 || repeat >= 10){
            System.out.println("Invalid repeat times");
            return;
        }

        long tmp = 0;
        for(int i = 1; i <= n; i++){
            tmp += (long) (a * i * Math.pow(10, n - i));
        }
         long result = repeat * tmp;

        System.out.println(result);
    }
}
