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
    public Productos (String nombre, int idproducto, double precio ){
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
}