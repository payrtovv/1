public class Auto {
    String marca;
    String modelo;
    String color = "Negro";
    double cilindraje;

    public void detalle(){
        System.out.println("La marca del auto es: "+ this.marca);
        System.out.println("auto.modelo = "+ this.modelo);
        System.out.println("auto.color = "+ this.color);
        System.out.println("auto.cilindraje = "+ this.cilindraje);
    }
}