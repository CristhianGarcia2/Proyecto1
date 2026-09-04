public class alimentos extends  Productos{

    private String tipoEmpaque;
    private int contenidoNetoMl;
    private double diasCaducidad;
    private boolean requiereRefrigeracion;


    public alimentos(String nombre, int idproducto, double precio, boolean stock, String tipoEmpaque, int contenidoNetoMl,
                     double diasCaducidad, boolean requiereRefrigeracion ) {

        super(nombre,  idproducto,  precio,  stock);
        this.tipoEmpaque = tipoEmpaque;
        this.contenidoNetoMl = contenidoNetoMl;
        this.diasCaducidad = diasCaducidad;
        this.requiereRefrigeracion = requiereRefrigeracion;
    }
    public alimentos(String nombre, int idproducto, double precio, String tipoEmpaque, int contenidoNetoML) {
        super(nombre, idproducto, precio);
        this.tipoEmpaque = tipoEmpaque;
        this.contenidoNetoMl = contenidoNetoML;
        this.diasCaducidad = 30.0;
        this.requiereRefrigeracion = false;
    }
    public alimentos(String nombre, int idproducto, String tipoEmpaque, int contenidoNetoML) {
        super(nombre, idproducto);
        this.tipoEmpaque = tipoEmpaque;
        this.contenidoNetoMl = contenidoNetoML;
        this.diasCaducidad = 15.0;
        this.requiereRefrigeracion = false;
    }
    public void probaralimento () {

        System.out.println("Se prueba el alimento");

    }
}