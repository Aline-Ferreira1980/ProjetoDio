package strings;

public class BuilderDeString {
    public static void main(String [] args){

        var nome = "Andre";
        final var builder = new StringBuilder(nome);
        System.out.println(builder.append("Luis"));

        final var reverse = builder.reverse(); //printa de tras pra frente

        System.out.println(reverse);

        final var insert = reverse.insert(0,"#").insert(reverse.length(),"#");
        System.out.println(insert);
    }
}
