package one.innovation.digital.classes.pessoa;

import one.innovation.digital.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main (String[]args){
        final var batman = new SuperUsuario("batman", "1234#@");
        batman.getLogin();
        //batman.getSenha();
        //String nomeDoCliente = batman.nome;

    }
}
