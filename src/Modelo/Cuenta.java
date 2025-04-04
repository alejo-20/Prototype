
package Modelo;

public class Cuenta {
    private String tipo;
    private double monto;
    
    public Cuenta(){
        tipo = "ahorro";
    }
    
    public Cuenta clonar(){
        Cuenta cuenta = null;
       try{
           cuenta = (Cuenta) clone();
       }catch (CloneNotSupportedException e){
           e.printStackTrace();
       }
       return cuenta;
    }
    
    public String toString(){
        return "Cuenta [tipo=" + tipo + ", monto=" + monto + "]";
    }
    
    public void setMonto (double monto){
        this.monto = monto;
    }
    
    public double getMonto(){
        return monto;
    }
    
}
