import java.util.*;

public class TH4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Menu\n" +
                    "1. Fahrenheit to Celsius\n" +
                    "2. Celsius to Fahrenheit\n" +
                    "0. Exit");
            int number = scanner.nextInt();
            switch (number) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter Fahrenheit");
                    double Fahrenheit = scanner.nextDouble();
                    System.err.println(fToC(Fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius");
                    double Celsius = scanner.nextDouble();
                    System.err.println(cToF(Celsius));
                    break;
                default:
                    break;
            }
        }
    }

    public static double fToC(double f) {
        return (5.0 / 9) * (f - 32);
    }

    public static double cToF(double c) {
        return c*33.8;
    }
}