public class Prueba {
    public static void main(String[] args) {
        Auto bmx = new Auto();
        bmx.marca ="BMW";
        bmx.modelo = "1537";
        bmx.color = "Blanco";
        bmx.cilindraje = 3.2;

        bmx.detalle();

        System.out.println("--------------------------------------");

        Auto mb = new Auto();

        mb.marca ="MB";
        mb.modelo = "911";
        mb.color = "Rojo";
        mb.cilindraje = 3.4;

        mb.detalle();

        System.out.println("------------------------------------------");

        Bicicleta bicicleta  = new Bicicleta();

        bicicleta.color="Amarillo";

        bicicleta.detalles();

        System.out.println("------------------------------------------");


        System.out.println(bicicleta.detallesbici());

    }
}