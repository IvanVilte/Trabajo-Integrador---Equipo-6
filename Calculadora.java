package tpIntegrador;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        String operacion;

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese la operación matemática: ");
        operacion = scanner.next();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        switch (operacion) {
            case "+":
                resultado = sumar(num1, num2);
                break;
            case "-":
                resultado = restar(num1, num2);
                break;
            case "*":
                resultado = multiplicar(num1, num2);
                break;
            case "/":
            	if(num2==0) {
            		System.out.println("Error...");
            	}
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Operación matemática no válida");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

}
