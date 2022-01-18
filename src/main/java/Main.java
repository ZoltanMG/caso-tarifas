import clases.AplicarTarifa;
import clases.Productos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner (System.in);
        Productos.imprimirProductos();
        while (true) {
            System.out.print("Producto: ");
            String producto = entradaScanner.next();
            if (producto.equals("quit")) {
                System.out.println("bye.");
                return;
            }
            System.out.print("descuento: ");
            int descuento = entradaScanner.nextInt();
            AplicarTarifa aplicarTarifa = new AplicarTarifa();
            int tarifaFinal = aplicarTarifa.tarifaFinal(producto, descuento);
            System.out.println("La tarifa completa es: " + "$" + tarifaFinal + "\n");
        }
        }
}
