package org.lessons.java.shop;

import java.math.BigDecimal;

public class TV extends Prodotto{

    //Attributi
    private int pollici;

    private String smart;

    public TV(String name, String description, BigDecimal price, BigDecimal iva, Categoria category, int pollici, String smart) throws IllegalArgumentException {
        super(name, description, price, iva, category);
        this.pollici = pollici;
        if (smart.equals("y")){
            this.smart = "smart";
        } else {
            this.smart = "not smart";
        }
    }

    public int getPollici() {
        return pollici;
    }

    public String getSmart() {
        return smart;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public String isSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    //Metodi

    @Override
    public String toString () {
        String infoProduct = getCode() + " " + getName() + "ha " + getPollici() + "è "+ getSmart() + ": " + getDescription() + " " + " il prezzo del prodotto con iva è: " + getPriceIva();
        return infoProduct;
    }
}
