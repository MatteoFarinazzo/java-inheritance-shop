package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    // ATTRIBUTI

    private String Color;
    private boolean wireless;

    //Costruttore
    public Cuffie(String name, String description, BigDecimal price, BigDecimal iva, Categoria category, String Color, boolean wireless) throws IllegalArgumentException {
        super(name, description, price, iva, category);
        this.Color= Color;
        this.wireless = wireless;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
