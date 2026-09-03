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
    public void probarropa () {

        System.out.println("Se prueba la ropa");

    }
}