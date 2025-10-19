import java.util.Scanner;

public class CarroCompra {
    private int[][] productos = new int[2][5];

    public CarroCompra() {
    }

    public int calcularTotal() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += subTotal(productos[0][i], productos[1][i]);
        }
        return total;
    }

    public void ingresarProductos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Ingreso de productos ===");

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la cantidad del producto " + (i + 1) + ": ");
            productos[0][i] = sc.nextInt();

            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            productos[1][i] = sc.nextInt();
        }

        System.out.println("Productos ingresados correctamente.\n");
    }

    public int subTotal(int cant, int precio) {
        Calculadora calc = new Calculadora(cant, precio);
        return calc.multiplicar();
    }

    public void mostrarTotal() {
        System.out.println("El total de la compra es: $" + this.calcularTotal());
    }

    public static void main(String[] args) {
        CarroCompra carrito = new CarroCompra();
        carrito.ingresarProductos();
        carrito.mostrarTotal();
    }
}
