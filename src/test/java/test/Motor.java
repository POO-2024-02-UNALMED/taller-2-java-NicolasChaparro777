package test;

public class Motor {
    public int numeroCilindros;
    public String tipo;
    public int registro;


    public void cambiarRegistro(int registro){
        this.registro = registro;
    }

    public void asignarTipo(String tipo){
        String[] tiposMotor = {"electrico", "gasolina"};
        for (String tipoMotor : tiposMotor){
            if (tipoMotor.equalsIgnoreCase(tipo)){
                this.tipo = tipo;
                break;
            }
        }
    }
}
