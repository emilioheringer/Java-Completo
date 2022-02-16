package com.emilioheringer.aula1;

public class Aula1 {

    public static void main(String[] args){
        /**
         byte   8bits
         short  16bits
         int    36bits
         long   64bits
         char
         boolean
         float 32bits
         double  64bits
         */

        int numer;
        numer = 5;

        System.out.println("O numero é: " + numer);

        double numer2 = 3.14;

        System.out.println("O valor de PI é:" + numer2);

        char letra = 'x';

        System.out.println("A letra é: " +letra);

        /**
         * +
         * -
         * *
         * /
         * %
         * ++
         * --
         */

        System.out.println("Agora o numer é: " + (numer + 2));

        System.out.println("A letra é: " +(++letra));

        /**
         *  ==
         *  !=
         *  >
         *  <
         *  <=
         *  >=
         */

        System.out.println("Será que 5>6? " +(5>6));

        /**
         * & and
         * | or
         * ^ xor
         * || or short circuit
         * && and short circuit
         * ! not
         */

        int x = 5;
        int y= 2;
        double z= (double) 5/2;
        System.out.println("Divisao de 5/2: " +z);
    }

}
