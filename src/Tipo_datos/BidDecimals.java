package Tipo_datos;

import java.math.BigDecimal;

public class BidDecimals {
    public static void main(String[] args) {
        BigDecimal valorA = new BigDecimal(2.5);
        BigDecimal valorB = new BigDecimal(2.1);


        BigDecimal resultado = valorA.remainder(valorB);
        System.out.println(resultado);
    }
}
