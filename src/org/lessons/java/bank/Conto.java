package org.lessons.java.bank;

import java.util.Random;

public class Conto {

    //attributi con rispettivi metodi per get e set
    private int numeroConto;
    public int getNumeroConto(){
        return numeroConto;
    }
    private String nome;
    public void setNome(){
        this.nome = nome;
    }
    private double saldo;
    public double getSaldo(){
        return saldo;
    }

    public Conto(String nome){
        this.numeroConto = generaNumeroConto();
        this.nome = nome;
        this.saldo = 0.0;
    }

    public void versare(double importo) {
        saldo += importo;
    }

    public boolean prelevare(double importo) {
        if (saldo >= importo) {
            saldo -= importo;
            return true;
        }
        return false;
    }

    public String informazioniConto() {
        return "Numero Conto: " + numeroConto + "\n" +
                "Proprietario: " + nome + "\n" +
                "Saldo: " + formattoSaldo();
    }

    public String formattoSaldo() {
        return String.format("%.2f€", saldo);
    }

    private int generaNumeroConto() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }

}
