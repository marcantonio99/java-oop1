package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nomeUtente = scan.nextLine();

        Conto conto = new Conto(nomeUtente);
        System.out.println("Conto creato con successo!");
        System.out.println(conto.informazioniConto());

        boolean esci = false;
        while (!esci) {
            System.out.println("\nScegli l'operazione da fare?");
            System.out.println("1. Versare una somma di denaro");
            System.out.println("2. Prelevare una somma di denaro");
            System.out.println("3. Uscire");
            System.out.print("Scelta: ");

            int scelta = scan.nextInt();
            double importo;

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci l'importo da versare: ");
                    importo = scan.nextDouble();
                    conto.versare(importo);
                    System.out.println("Operazione di versamento effettuata.");
                    System.out.println("Saldo attuale: " + conto.formattoSaldo());
                    break;
                case 2:
                    System.out.print("Inserisci l'importo da prelevare: ");
                    importo = scan.nextDouble();
                    if (conto.prelevare(importo)) {
                        System.out.println("Operazione di prelievo effettuata.");
                    } else {
                        System.out.println("Saldo insufficiente. Operazione non valida.");
                    }
                    System.out.println("Saldo attuale: " + conto.formattoSaldo());
                    break;
                case 3:
                    esci = true;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }
}
