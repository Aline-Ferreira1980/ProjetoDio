package strings;

public class Strings {
    public static void main (String [] args){
        var nome = "André ";
        var sobrenome = "Gomes";
        final var nomeCompleto = nome+sobrenome;

        System.out.println(nome);
        System.out.println("Nome do Cliente: " +nome);
        System.out.println("Nome completo do cliente: "+nomeCompleto);
        var string = new String("Minha String");

        System.out.println("Char na posição: " + string.charAt(4));
        System.out.println("Quantidade: "+string.length());
        System.out.println("Sem Trim ["+ string.trim() + "]"); // com espaço
        System.out.println("Com Trim ["+string.trim()+ "]"); // sem espaço
        System.out.println("Lower "+ string.toLowerCase());
        System.out.println("Upper " + string.toUpperCase());
        System.out.println("Contém M?"+ string.contains("M")); // se contem algum item mensionado
        System.out.println("Contém X?"+ string.contains("X"));
        System.out.println("Replace "+ string.replace("n", "$" )); // substitui uma letra por outra designada
        System.out.println("Equals "+ string.equals("Minha String"));
        System.out.println("EqualsIgnoreCase "+string.equalsIgnoreCase("minha sTring")); //Independente da forma que se escrever irá sair igual ao original
        System.out.println("Substring (1,6)"+string.substring(1,6) );
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula Java ".split(" "));
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]", "#")); //Substituiu o número por #
    }
}
