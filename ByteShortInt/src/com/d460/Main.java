package com.d460;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// int has a width of 32
        int minValue = -2147483648;
        int maxValue = 2147483647;

        //byte has a width of 8

        byte myByteValue = -128;

        //short has a width of 16

        short myShortValue = 32767;

        //long has a width of 64

        long myLongValue = 9223372036854775807L;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Libras: ");
        double libras = entrada.nextDouble();

        double kilo = .45359237*libras;

        System.out.printf("Kilos: %f\n", kilo);

        double under = 3_455_533.543_45;

        System.out.println("num " + under);

        char myChar = '\u265E';
        System.out.println("Char " + myChar);

    }
}
