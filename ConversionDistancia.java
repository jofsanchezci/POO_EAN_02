import java.util.Scanner;

public class ConversionDistancia {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la distancia en kilómetros
        System.out.print("Ingresa la distancia en kilómetros: ");
        double kilometros = scanner.nextDouble();

        // Convertir kilómetros a metros (1 kilómetro = 1000 metros)
        double metros = kilometros * 1000;

        // Convertir kilómetros a centímetros (1 kilómetro = 100000 centímetros)
        double centimetros = kilometros * 100000;

        // Imprimir los resultados
        System.out.println(kilometros + " kilómetros equivalen a " + metros + " metros.");
        System.out.println(kilometros + " kilómetros equivalen a " + centimetros + " centímetros.");
    }
}
