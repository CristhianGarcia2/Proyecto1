public class Main {

    public static void main(String[] args) {

        electronicos televisor = new electronicos("Smart TV", 101, 1500.0, "Sony", 220);
        ropa camisa = new ropa("Camisa Formal", 201, 45.0, "Algodón", 2.0);
        alimentos yogurt = new alimentos("Yogurt Griego", 301, "Plástico", 500);

        System.out.println("Demostracion de getters y setters de las diferentes clases");

        //Electronicos

        System.out.println("Fabricante inicial : " + televisor.getFabricante());
        televisor.setFabricante("Samsung");
        System.out.println("Fabricante modificado: " + televisor.getFabricante());

        //Ropa

        System.out.println("Material inicial : " + camisa.getMaterial());
        camisa.setMaterial("Lino");
        System.out.println("Material modificado: " + camisa.getMaterial());

        //Alimentos

        System.out.println("Empaque inicial: " + yogurt.getTipoEmpaque());
        yogurt.setTipoEmpaque("Vidrio");
        System.out.println("Empaque modificado: " + yogurt.getTipoEmpaque());

        //Revision del polimorfismo

        System.out.println("ESTADO FINAL DE LOS OBJETOS");
        System.out.println(televisor.toString());
        System.out.println(camisa.toString());
        System.out.println(yogurt.toString());
    }
}