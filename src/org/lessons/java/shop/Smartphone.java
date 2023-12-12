package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {

    //Attributi

    private int codiceImei;
    private int storage;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva, Categoria category, int storage ) throws IllegalArgumentException {
        super(name, description, price, iva, category);
        this.storage = storage;

        this.codiceImei = randomImei();
    }

    //GETTER

    public int getStorage(){
        return storage;
    }

    public int getCodiceImei() {
        return codiceImei;
    }

    //SETTER
    public void setCodiceImei(int codiceImei) {
        this.codiceImei = codiceImei;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    Random random = new Random();

    private int randomImei (){
       int num = random.nextInt(1000000, 9999999);
       return num;
    }


    //Metodi
    @Override
    public String toString () {
        String infoProduct = getCode() + " " + getName() + " codice IMEI: "+ getCodiceImei() + " ram da " + getStorage() + ": " + getDescription() + " " + " il prezzo del prodotto con iva è: " + getPriceIva();
        return infoProduct;
    }
}
