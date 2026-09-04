public class electronicos extends  Productos {

    private String fabricante;
    private int voltaje;
    private double consumoKwh;
    private boolean tieneGarantia;

    public electronicos(String nombre, int idproducto, double precio, boolean stock, String fabricante,
                        int voltaje, double consumoKwh, boolean tieneGarantia) {

        super(nombre, idproducto, precio, stock);
        this.fabricante = fabricante;
        this.voltaje = voltaje;
        this.consumoKwh = consumoKwh;
        this.tieneGarantia = tieneGarantia;

    }
    public electronicos(String nombre, int idproducto, double precio, String fabricante, int voltaje) {
        super(nombre, idproducto, precio);
        this.fabricante = fabricante;
        this.voltaje = voltaje;
        this.consumoKwh = 1.5;
        this.tieneGarantia = true;
    }
    public electronicos(String nombre, int idproducto, String fabricante, int voltaje) {
        super(nombre, idproducto);
        this.fabricante = fabricante;
        this.voltaje = voltaje;
        this.consumoKwh = 1.0;
        this.tieneGarantia = true;
    }

    public void encendio () {

        System.out.println("Se enciende");

    }
}