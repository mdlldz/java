package com.hspedu.bignum;

import java.math.BigInteger;
public class BigInteger_ {
    public static void main(String[] args) {
//        long l = 23788888899999999999999999999l;
//        System.out.println("l=" + l);

        BigInteger bigInteger = new BigInteger("23788888899999999999999999999");
        BigInteger bigInteger2 = new BigInteger("10099999999999999999999999999999999999999999999999999999999999999999999999999999999");
        System.out.println(bigInteger);

        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);
        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);
    }
}
