
import java.util.Scanner;

public class TiendaOrquideas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] codigos = {110, 115, 120, 125, 130, 135};
        double[] precios = {1500, 5000, 1100, 1000, 3000, 1750};

        System.out.println("Bienvenido a Piñata las Orquídeas");
        System.out.println("Seleccione un producto:");
        System.out.println("1. Producto 1 (Código: 110, Precio: $1500)");
        System.out.println("2. Producto 2 (Código: 115, Precio: $5000)");
        System.out.println("3. Producto 3 (Código: 120, Precio: $1100)");
        System.out.println("4. Producto 4 (Código: 125, Precio: $1000)");
        System.out.println("5. Producto 5 (Código: 130, Precio: $3000)");
        System.out.println("6. Producto 6 (Código: 135, Precio: $1750)");

        System.out.print("Ingrese el número del producto (1-6): ");
        int producto = sc.nextInt();

        if (producto < 1 || producto > 6) {
            System.out.println("Producto no válido.");
            return;
        }

        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();

        double precioUnitario = precios[producto - 1];
        double descuento = 0;

        switch (producto) {
            case 2: 
                if (cantidad <= 12) {
                    descuento = 0;
                } else if (cantidad <= 24) {
                    descuento = 10;
                } else if (cantidad <= 36) {
                    descuento = 15;
                } else {
                    descuento = 20;
                }
                break;

            case 5: 
                if (cantidad <= 16) {
                    descuento = 0;
                } else if (cantidad <= 32) {
                    descuento = 6.25;
                } else {
                    descuento = 12.5;
                }
                break;

            default:
                descuento = 0;
        }
     
        double subtotal = precioUnitario * cantidad;
        double totalDescuento = subtotal * (descuento / 100);
        double totalPagar = subtotal - totalDescuento;

        System.out.println("Resumen de la compra:");
        System.out.println("Producto: " + producto + " (Código: " + codigos[producto - 1] + ")");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Total a pagar: $" + totalPagar);
    }
}