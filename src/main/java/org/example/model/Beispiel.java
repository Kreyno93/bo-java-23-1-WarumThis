package org.example.model;

public class Beispiel {
    private int zahl;

    public Beispiel(int zahl) {
        this.zahl = zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl; // "this" verweist auf die Instanzvariable "zahl"
    }

    public void doSomething() {
        int zahl = 5; // lokale Variable "zahl"
        System.out.println("Lokale Variable zahl: " + zahl);
        System.out.println("Instanzvariable zahl: " + this.zahl);
    }
}