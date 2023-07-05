import java.util.Scanner;

public class funciones {
    public static void main(String[] args) {
        // Rellenar
        try (Scanner scanner = new Scanner(System.in)) {
            // Rellenar
            double[] numbers = new double[2];
            System.out.print("Ingrese el primer número: ");
            numbers[0] = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            numbers[1] = scanner.nextDouble();
            
            // Suma
            double sum = suma(numbers[0], numbers[1]);
            System.out.println("Suma: " + sum);
            
            // Resta
            double difference = resta(numbers[0], numbers[1]);
            System.out.println("Resta: " + difference);
            
            // Multiplicación
            double product = multiplicacion(numbers[0], numbers[1]);
            System.out.println("Multiplicación: " + product);
            
            // División
            if (numbers[1] != 0) {
                double division = division(numbers[0], numbers[1]);
                System.out.println("División: " + division);
            } else {
                System.out.println("No se puede dividir entre cero.");
            }
        }
    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}
