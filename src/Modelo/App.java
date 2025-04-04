
package Modelo;

public class App {

    public static void main(String[] args) {
        Cuenta cuentaAhorro = new Cuenta();
        cuentaAhorro.setMonto (200);
        Cuenta cuentaAhorro2 = new Cuenta();
        Cuenta cuentaClonada = (Cuenta) cuentaAhorro.clonar();
        
        System.out.println(cuentaAhorro);
        System.out.println(cuentaAhorro2);
        System.out.println(cuentaClonada);
        
        /* if (cuentaClonada != null) {
        system.out.println(cuentaClonada);
        }
    System.out.println(cuentaClonada == cuentaAhorro);*/
    }
}
