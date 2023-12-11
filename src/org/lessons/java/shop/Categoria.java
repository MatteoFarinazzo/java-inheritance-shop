package org.lessons.java.shop;

public class Categoria {
    //ATTRIBUTI
    private String categoryName;
    private String categoryDescription;

    //COSTRUTTORI

    public Categoria (String categoryName){
        this.categoryName = categoryName;
        this.categoryDescription = getCategoryDescription();
    }

    //Getter


    public String getCategoryName() {
        return categoryName;
    }

    public String getItemDescription() {
        return categoryDescription;
    }

    //Setter
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    //Metodi

    private String getCategoryDescription (){

        if (categoryName.equals("Bricolage")){
            categoryDescription = "Prodotti per i piccoli lavori eseguiti in casa per hobby o divertimento";
        } else if (categoryName.equals("Casalinghi")){
            categoryDescription =  "Prodotti per i lavori domestici, cura della casa o arredamento";
        } else if (categoryName.equals("Sport")){
            categoryDescription = "Prodotti per la pratica sportiva";
        } else if (categoryName.equals("Informatica")){
            categoryDescription = "Prodotti tecnologici";
        } else {
            categoryDescription = "Prodotti generici o senza categoria specifica";
        }
        return categoryDescription;
    }


}
