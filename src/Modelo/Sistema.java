package Modelo;

public class Sistema {

    public static void main(String[] args) {
        Usuario usuarioBase = new Usuario();
        usuarioBase.setSaldo(200);

        Usuario usuarioSinSaldo = new Usuario();
        Usuario usuarioClonado = (Usuario) usuarioBase.clonar();

        System.out.println(usuarioBase);
        System.out.println(usuarioSinSaldo);
        System.out.println(usuarioClonado);

    }
}