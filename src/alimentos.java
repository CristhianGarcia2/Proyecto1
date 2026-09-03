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
    public void probaralimento () {

        System.out.println("Se prueba el alimento");

    }
}