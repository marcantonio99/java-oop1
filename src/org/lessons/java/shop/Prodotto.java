package org.lessons.java.shop;

public class Prodotto{

    //attributi con rispettivi metodi per get e set
    private int codice;
    public int getCodice(){
        return this.codice;
    }
    private String nome;
    public String setNome(){
        return this.nome;
    }
    private String descrizione;
    public String setDescrizione(){
        return this.descrizione;
    }
    private double prezzo;
    public double setPrezzo(){
        return this.prezzo;
    }
    private double iva;
    public double setIva(){
        return this.iva;
    }

    //metodi per avere prezzo base, più iva e nome completo prodotto
    String getPrezzoBase(){
        String prezzoBase = "prezzo: " + prezzo;
        return prezzoBase;
    }

    String getPrezzoCompleto(){
        String prezzoCompleto = getPrezzoBase() + iva;
        return prezzoCompleto;
    }

    String getNomeCompleto(){
        String nomeCompleto = "nome prodotto: " + nome + " " + "codice: " + codice;
        return nomeCompleto;
    }
}
