import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        scanner.close();
        double celsius = fahrenheitToCelsius(fahrenheit);

        System.out.printf("The temperature is %.2f\n", celsius);
    }

    public  static  double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

}
