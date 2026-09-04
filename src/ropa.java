public class ropa extends  Productos{

    private String material;
    private int pesoGramos;
    private double talla;
    private boolean aptaPlanchado;


    public ropa(String nombre, int idproducto, double precio, boolean stock, String material, int pesoGramos,
                double talla, boolean aptaPlanchado) {

        super(nombre,  idproducto,  precio,  stock);

        this.material = material;
        this.pesoGramos = pesoGramos;
        this.talla = talla;
        this.aptaPlanchado = aptaPlanchado;
    }
    public ropa(String nombre, int idproducto, double precio, String material, double talla) {
        super(nombre, idproducto, precio);
        this.material = material;
        this.pesoGramos = 200;
        this.talla = talla;
        this.aptaPlanchado = true;
    }
    public ropa(String nombre, int idproducto, String material, double talla) {
        super(nombre, idproducto);
        this.material = material;
        this.pesoGramos = 150;
        this.talla = talla;
        this.aptaPlanchado = true;
    }


    public void probarropa () {

        System.out.println("Se prueba la ropa");

    }
}