package com.example.moview;

import java.util.Scanner;

public class Mouse {

    public static void main(String[] args) {
        String primeraPalabra = "¡Entendiendo";
        String segundaPalabra = "la";

        String ultimaFrase = primeraPalabra + " " + segundaPalabra;
        System.out.println(ultimaFrase); // "¡Entendiendo la"

        ultimaFrase += " programación!";
        System.out.println(ultimaFrase); // "¡Entendiendo la programación!"

    }
}

