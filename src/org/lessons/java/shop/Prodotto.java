package org.lessons.java.shop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

public class Prodotto {
 //ATTRIBUTI

    private Categoria category;
    private int code ;
    private String name ;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    //COSTRUTTORI

    public Prodotto (String name, String description, BigDecimal price, BigDecimal iva, Categoria category) throws IllegalArgumentException{

        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("you have to write a valid name");
        }
        validatePrice(price);
        validateVat(iva);

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
    public BigDecimal getPrice() {
        return price;
    }
    public BigDecimal getPriceIva() {
        BigDecimal priceIva = (price.multiply(iva)).divide(BigDecimal.valueOf(100)).add(price) ;
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

    public void setPrice(BigDecimal price) {
        validatePrice(price);
        this.price = price;
    }

    public void setIva(BigDecimal iva) {
        validateVat(iva);
        this.iva = iva;
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

    private void validatePrice(BigDecimal price) throws IllegalArgumentException{
        if(price == null || price.compareTo(new BigDecimal(0)) < 0){
            // prezzo negativo
            throw new IllegalArgumentException("price cannot be under 0");
        }
    }

    private void validateVat(BigDecimal iva) throws IllegalArgumentException{
        if(iva == null || iva.compareTo(new BigDecimal(0))< 0){
            throw new IllegalArgumentException("iva cannot be under 0");
        }
    }




}
