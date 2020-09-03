package one.innovation.digital.tipos.primitivos;

public class Primitivos {
    public static void main(String[] args) {
        //inteiros
        //byte nullByte= null;

        byte b;    //8 bits
        byte b1 = 127;
        byte b2 = -128;
        //byte b3=129 //to large

        char c;         //16 bits
        char c1= 'A';
        char c2 = 15;
        //char c3 ='AA'  nok
        //char c4 = -100 nok

        short s;            //16 bits
        short s1= 32767;
        short s2 = -32768;

        int i =2147483647;     //32 Bits
        int i1 = -2147483648;
        //int i2 = -2147483649;  to larger

        long l=9223372036854775806l; //64bits
        long l1= 9223372036854775807l;
        //long l2 = 9223372036854775808l    to larger;

        //FLUTUANTES;

        float f= 65f;           //32 bits
        float f1= 65.0f;
        float f2 = 0.5f;


        double d = 1024.99; //64 bits;
        double d1 = 10.2456;

        //BOOLEANOS;

        boolean bo = true;
        boolean bo1 = false;


    }
}
