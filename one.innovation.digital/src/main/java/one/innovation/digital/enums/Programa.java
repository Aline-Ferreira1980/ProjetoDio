package one.innovation.digital.enums;

public class Programa {
    public static void main(String[] args){
       // final TipoVeiculo tipoVeiculo = new TipoVeiculo();
        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //System.out.println(tipoVeiculo.valueOf("aereo"));
        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for (TipoVeiculo tipo: TipoVeiculo.values()){
            System.out.println("tipo: "+ tipo);
        }
        System.out.println("Código do Status CLOSE: "+ Status.CLOSE.getCod());
        System.out.println("Texto do Status OPEN: "+ Status.OPEN.getTexto());
    }
}
