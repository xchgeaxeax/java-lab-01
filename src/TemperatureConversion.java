import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
//        System.out.println("Fahrenheit to Celsius conversion program");
//        System.out.println("Please input a Fahrenheit temperature:");

        // Get Fahrenheit temperature from use input, using double
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        scanner.close();
        double celsius = fahrenheitToCelsius(fahrenheit);

        // The output is Fahrenheit temperature rounded to 2
//        System.out.printf("The Celsius temperature is %.2f\n", celsius);
        System.out.printf("The temperature is %.2f\n", celsius);
    }

    public  static  double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

}
