package sistemaInventario;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("001", "Producto1", 10, 100);
        System.out.println("Codigo: " + producto.getCodigo());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("Precio: " + producto.getPrecio());
    }
}
    

