package T6ejercicio.racional_V2;



public class PruebaRacional {

    public static void main(String[] args) {

        Racional r1 = new Racional(2,3);       
        System.out.println(r1.toDecimal());
        Racional r2 = new Racional(6,9);       
        Racional suma=r1.suma(r2);
        System.out.println(suma.toString()); // 4/3

//        Racional r3 = new Racional();
//        r3.setNumerador(5);
//        r3.setDenominador(6);
//        Racional r4 = new Racional();
//        r4.setNumerador(4);
//        r4.setDenominador(3);
//        System.out.println(r3.resta(r4).toString()); // -1/2
//
//        Racional r5 = new Racional();
//        r5.setNumerador(4);
//        r5.setDenominador(7);
//        Racional r6 = new Racional();
//        r6.setNumerador(3);
//        r6.setDenominador(5);
//        System.out.println(r5.producto(r6).toString()); // 12/35
//
//        Racional r7 = new Racional();
//        r7.setNumerador(1);
//        r7.setDenominador(2);
//        Racional r8 = new Racional();
//        r8.setNumerador(3);
//        r8.setDenominador(5);
//        System.out.println(r7.division(r8).toString()); // 5/6

    }
}
