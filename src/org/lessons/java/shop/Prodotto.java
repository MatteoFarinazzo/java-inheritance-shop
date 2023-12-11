package org.lessons.java.shop;

import java.time.LocalDate;
import java.util.Random;

public class Prodotto {
 //ATTRIBUTI

    private Categoria category;
    private int code ;
    private String name ;
    private String description;
    private Double price;
    private int iva;

    //COSTRUTTORI

    public Prodotto (String name, String description, Double price, int iva, Categoria category) throws IllegalArgumentException{

        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("you have to write a valid name");
        }
        if (price < 0){
            throw new IllegalArgumentException("price cannot be under 0");
        }
        if (iva < 0){
            throw new IllegalArgumentException("iva cannot be under 0");
        }

      this.code = getRandomCode();
      this.name = name;
      this.description = description;
      this.price = price;
      this.iva = iva;
      this.category = category;
    }

    //GETTER


    public int getCode() {
        return code;
    }

    public String getName(){
        this.name = name;
        return name;
    }
    public String getDescription(){
        this.description = description;
        return description;
    }
    public Double getPrice() {
        return price;
    }
    public double getPriceIva() {
        double priceIva = ((price * iva) / 100) + price;
        return priceIva;
    }

    public Categoria getCategory() {
        return category;
    }

    //SETTER

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("you have to write a valid name");
        } else{
        this.name = name;
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        if (price < 0){
            throw new IllegalArgumentException("price cannot be under 0");
        } else{
        this.price = price;
        }
    }

    public void setIva(int iva) {
        if (iva < 0){
            throw new IllegalArgumentException("iva cannot be under 0");
        } else {
        this.iva = iva;
        }
    }

    public double price(){
        this.price = price;
        return price;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }

    // METODI

    private int getRandomCode() {
        int randomCode =  random.nextInt(1000,9999);
        return randomCode;
    }
    Random random = new Random();


    public String getProductInfo () {
        String infoProduct = code + " " + name + ": " + description + " " + " il prezzo del prodotto è: " + price;
        return infoProduct;
    }

    public String getProductInfoIva () {
        String infoProduct = code + " " + name + ": " + description + " " + " il prezzo del prodotto con iva è: " + getPriceIva();
        return infoProduct;
    }

    public String getProductInfoFull () {
        String infoProduct = code + " " + name + ": " + description + " " + " il prezzo del prodotto è: " + price;
        return infoProduct;
    }

    public String getProductInfoIvaFull () {
        String infoProduct = code + " " + name + ": " + description + " " + " il prezzo del prodotto con iva è: " + getPriceIva();
        return infoProduct;
    }


}
