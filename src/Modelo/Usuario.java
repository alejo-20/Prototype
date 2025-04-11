package Modelo;

public class Usuario {
    private String categoria;
    private double saldo;

    public Usuario(){
        categoria = "regular";
    }

    public Usuario clonar(){
        Usuario usuario = null;
        try {
            usuario = (Usuario) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    public String toString(){
        return "Usuario [categoria=" + categoria + ", saldo=" + saldo + "]";
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }
}