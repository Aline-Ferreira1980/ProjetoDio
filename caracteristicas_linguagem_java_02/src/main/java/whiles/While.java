package whiles;

public class While {
    public static void main(String[] args){
        var x = 0;
        //testa a condição antes

        while (x<1){
            System.out.println("Dentro do While");
            x++;
        }
        var y = 0;
        //testa a condição depois
        do {
            System.out.println("Dentro do do/while...");
        }while (y++<1);
    }
}
