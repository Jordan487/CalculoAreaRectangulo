package rectangulo;

import java.util.Scanner;

// Programa principal que calcula el área de un rectángulo usando POO
public class CalculoAreaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el ancho del rectángulo: ");
        float ancho = scanner.nextFloat();

        System.out.print("Ingrese el alto del rectángulo: ");
        float alto = scanner.nextFloat();

        // Crear un objeto Rectangulo
        Rectangulo miRectangulo = new Rectangulo(ancho, alto);

        // Mostrar resultados
        System.out.println("El área del rectángulo es: " + miRectangulo.calcularArea());
        System.out.println("¿El área es grande (mayor a 50)? " + miRectangulo.esAreaGrande());

        scanner.close();
    }
}
