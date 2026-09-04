public class Productos {

    private String nombre;
    private int idproducto;
    private double precio;
    private boolean stock;

    public Productos(String nombre, int idproducto, double precio, boolean stock) {
        this.nombre = nombre;
        this.idproducto = idproducto;
        this.precio = precio;
        this.stock = stock;
    }

    public Productos(String nombre, int idproducto, double precio) {
        this.nombre = nombre;
        this.idproducto = idproducto;
        this.precio = precio;
        this.stock = true;
    }

    public Productos(String nombre, int idproducto) {
        this.nombre = nombre;
        this.idproducto = idproducto;
        this.precio = 0.0;
        this.stock = true;
    }

    //Get

    public String getNombre() {
        return nombre;
    }
    public int getIdproducto() {
        return idproducto;
    }
    public double getPrecio() {
        return precio;
    }
    public boolean isStock() {
        return stock;
    }

    //Set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setStock(boolean stock) {
        this.stock = stock;
    }
}