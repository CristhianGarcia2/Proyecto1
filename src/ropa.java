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

    //Get

    public String getMaterial() {
        return material;
    }
    public int getPesoGramos() {
        return pesoGramos;
    }
    public double getTalla() {
        return talla;
    }
    public boolean isAptaPlanchado() {
        return aptaPlanchado;
    }

    //Set

    public void setMaterial(String material) {
        this.material = material;
    }
    public void setPesoGramos(int pesoGramos) {
        this.pesoGramos = pesoGramos;
    }
    public void setTalla(double talla) {
        this.talla = talla;
    }
    public void setAptaPlanchado(boolean aptaPlanchado) {
        this.aptaPlanchado = aptaPlanchado;
    }
    @Override
    public String toString() {
        return "Ropa" + super.toString() + ", Material: " + material +
                ", Peso: " + pesoGramos + "g, Talla: " + talla + ", Apta planchado: " + aptaPlanchado ;
    }
}