package one.innovation.digital.statics;

public class Programa {
   public static void main(String[] args){

       final Cachorro pitbul= new Cachorro();
       pitbul.zoologia = "Bípede";

       final Cachorro viraLatas = new Cachorro();

       System.out.println(pitbul.zoologia);
       System.out.println(viraLatas.zoologia);

       Cachorro.late();
   }
}
