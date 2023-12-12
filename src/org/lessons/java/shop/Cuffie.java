package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    // ATTRIBUTI

    private String Color;
    private String wireless;

    //Costruttore
    public Cuffie(String name, String description, BigDecimal price, BigDecimal iva, Categoria category, String Color, String wireless) throws IllegalArgumentException {
        super(name, description, price, iva, category);
        this.Color= Color;
        if (wireless.equals("y")){
            this.wireless = "wireless";
        } else {
            this.wireless = "not wireless";
        }
    }

    // GETTER

    public String getColor() {
        return Color;
    }
    public String getWireless() {
        return wireless;
    }

    //SETTER

    public void setColor(String color) {
        Color = color;
    }


    public String isWireless() {
        return wireless;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    //Metodi

    @Override
    public String toString () {
        String infoProduct = getCode() + " " + getName() + " di colore " + getColor() + " sono "+ getWireless() + ": " + getDescription() + " " + " il prezzo del prodotto con iva è: " + getPriceIva();
        return infoProduct;
    }
}
