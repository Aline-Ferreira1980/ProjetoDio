package one.innovation.digital.classes.usuario;

public class ProgramaSuperUsuario {
    public static void main (String []args){
        final var superUsuario= new SuperUsuario( "root", "123@#");
        superUsuario.getLogin();
        superUsuario.getSenha();

        String root =superUsuario.nome;
    }
}
