package test;

public class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static String cantidadCreados;

    public int cantidadAsientos(){
        int asientosTotales = 0;
        for (Asiento asiento : this.asientos){
            if (asiento != null){
                asientosTotales += 1;
            }
        }
        return asientosTotales;
    }

    public String verificarIntegridad(){
        
        boolean comprobante = false;
        String mensaje = " ";

        if (this.registro == this.motor.registro){
            
            comprobante = true;
            
            for (Asiento asiento : this.asientos){
                if (asiento == null){
                    continue;
                }
                else if (asiento.registro == this.registro){
                    comprobante = true;
                }
                else{
                    comprobante = false;
                }
                }
            }
        
        if (comprobante == false){
            mensaje = "Las piezas no son originales";
        }
        else{
            mensaje = "Auto original";
        }
        return mensaje;
        }
    }

