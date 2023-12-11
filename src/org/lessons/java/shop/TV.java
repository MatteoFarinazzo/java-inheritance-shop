package org.lessons.java.shop;

import java.math.BigDecimal;

public class TV extends Prodotto{

    //Attributi
    private int pollici;

    private boolean smart;
    public TV(String name, String description, BigDecimal price, BigDecimal iva, Categoria category, int pollici, boolean smart) throws IllegalArgumentException {
        super(name, description, price, iva, category);
        this.pollici = pollici;
        this.smart = smart;
    }

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
