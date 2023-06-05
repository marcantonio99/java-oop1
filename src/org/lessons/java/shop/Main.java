package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Prodotto prodotto1 = new Prodotto("Prodotto 1", "Descrizione prodotto 2", 40.0, 0.22);
        System.out.println("Codice prodotto 1: " + prodotto1.getCodice());
        System.out.println("Nome prodotto 1: " + prodotto1.getNome());
        System.out.println("Descrizione prodotto 1: " + prodotto1.getDescrizione());
        System.out.println("Prezzo prodotto 1: " + prodotto1.getPrezzo());
        System.out.println("Prezzo prodotto 1: " + prodotto1.getIva());
        System.out.println("Prezzo con iva prodotto 1: " + prodotto1.getPrezzoConIva());
        System.out.println("Nome completo prodotto 1: " + prodotto1.getNomeCompleto());

        Prodotto prodotto2 = new Prodotto("Prodotto 2", "Descrizione prodotto 2", 30.0, 0.23);
        System.out.println("Codice prodotto 2: " + prodotto2.getCodice());
        System.out.println("Nome prodotto 2: " + prodotto2.getNome());
        System.out.println("Descrizione prodotto 2: " + prodotto2.getDescrizione());
        System.out.println("Prezzo prodotto 2: " + prodotto2.getPrezzo());
        System.out.println("Prezzo prodotto 2: " + prodotto2.getIva());
        System.out.println("Prezzo con iva prodotto 2: " + prodotto2.getPrezzoConIva());
        System.out.println("Nome completo prodotto 2: " + prodotto2.getNomeCompleto());

    }
}
