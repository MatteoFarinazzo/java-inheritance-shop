package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {

    //Attributi

    private int codiceImei;
    private int storage;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva, Categoria category ) throws IllegalArgumentException {
        super(name, description, price, iva, category);

        codiceImei = randomImei();
    }

    public int getStorage(){
        return storage;
    }

    public int getCodiceImei(){

    }

    Random random = new Random();

    private int randomImei (){
        random.nextInt(1000000, 9999999);
    }
}
