package test;

public class Asiento {
    public String color;
    public int precio;
    public int registro;


    public void cambiarColor(String color){
        String[] colores = {"rojo", "verde", "amarillo", "negro", "blanco"};
        for (String colorPermitido : colores){
            if (colorPermitido.equalsIgnoreCase(color)){
                this.color = color;
                break;
            }
        }
    }
}
