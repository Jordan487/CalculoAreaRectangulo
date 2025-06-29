package rectangulo;

// Clase que representa un rectángulo
public class Rectangulo {
    // Atributos
    private final float ancho;
    private final float alto;

    // Constructor
    public Rectangulo(float ancho, float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para calcular el área
    public float calcularArea() {
        return ancho * alto;
    }

    // Método para saber si el área es grande
    public boolean esAreaGrande() {
        return calcularArea() > 50;
    }
}
