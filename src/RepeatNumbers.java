import java.util.Scanner;
public class RepeatNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i++){
            long a = sc.nextLong();
            long n = sc.nextLong();
            long result1 = repeatNumbers(a, n);
            System.out.println(result1);
        }
        sc.close();
    }
    public static long repeatNumbers (long a,long n){
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += (long) (a * i * Math.pow(10, n - i));
        }
        return result;
    }
}
