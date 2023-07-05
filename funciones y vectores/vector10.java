import java.util.Scanner;

public class vector10 {
    public static void main(String[] args) {
        int dimension = 10;
        double[] vector = new double[dimension];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < dimension; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            vector[i] = scanner.nextDouble();
        }
        
        System.out.println("Vector ingresado:");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Posición " + i + ": " + vector[i]);
        }
        
        scanner.close();
    }
}
