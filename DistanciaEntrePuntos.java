import java.util.Scanner;

public class DistanciaEntrePuntos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las coordenadas del primer punto
        System.out.print("Ingresa la coordenada x1 del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y1 del primer punto: ");
        double y1 = scanner.nextDouble();

        // Pedir al usuario que ingrese las coordenadas del segundo punto
        System.out.print("Ingresa la coordenada x2 del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y2 del segundo punto: ");
        double y2 = scanner.nextDouble();

        // Calcular la distancia entre los dos puntos usando la fórmula
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Imprimir el resultado
        System.out.println("La distancia entre los puntos (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + distancia);
    }
}
