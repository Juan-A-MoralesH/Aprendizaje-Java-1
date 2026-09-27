package sistemaInventario;


public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private int precio;

    public Producto(String codigo, String nombre, int cantidad, int precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Seteadores (Setters)
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Geteadores (Getters)
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public int getPrecio() {
        return precio;
    }

    }

