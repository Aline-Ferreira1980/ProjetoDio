package strings;

public class StringFormat {
    public static void main (String[] args){
        var nome = "André ";
        var sobrenome = "Gomes";
        final var nomeCompleto = nome+sobrenome;
        System.out.println(nome);
        System.out.println("Nome do Cliente: " +nome);
        System.out.println("Nome completo do cliente: "+nomeCompleto);
        final var mensagem = String.format("O cliente %s possui sobrenome %s ",nome,sobrenome);

        System.out.println(mensagem);
        System.out.println(String.format("NÚmero %.2f",1.2375d));

    }
}
