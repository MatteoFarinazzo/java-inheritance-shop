package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productNumber = 0;

        boolean validNum = false;
        while (!validNum) {
            try {
                System.out.println("Quanti prodotti vuoi inserire nella lista?");
                productNumber = Integer.parseInt(scanner.nextLine());
                validNum = true;
            } catch (NumberFormatException e) {
                System.out.println("This is not a number");
            }
        }


        Prodotto[] listOfProducts = new Prodotto[productNumber];

        for (int i = 0; i < listOfProducts.length; i++) {

            boolean isValid = false;
            while (!isValid) {
                try {
                    System.out.println("Inserisci il nome del prodotto");
                    String name = scanner.nextLine();
                    //Il nome del prodotto non può essere vuoto

                    System.out.println("Inserisci una descrizione del prodotto");
                    String description = scanner.nextLine();
                    System.out.println("Di che categoria fa parte tra le seguenti? Casalinghi, Bricolage, Sport, Informatica");
                    String categoryName = scanner.nextLine();
                    System.out.println("Inserisci il prezzo del prodotto");
                    Double price = Double.parseDouble(scanner.nextLine());
                    // Il prezzo non può essere negativo

                    System.out.println("Inserisci l'iva da applicare al prodotto");
                    int iva = Integer.parseInt(scanner.nextLine());
                    //L'iva non può essere negativa

                    Categoria categoria = new Categoria(categoryName);
                    Prodotto product = new Prodotto(name, description, price, iva, categoria);
                    listOfProducts[i] = product;
                    isValid = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("This Data is invalid: " + e.getMessage());
                }
            }
            
        }


        System.out.println("I prodotti nel tuo carrello sono:");
        for (int i = 0; i < listOfProducts.length; i++) {
            /*System.out.println(listOfProducts[i].getProductInfo());
            System.out.println(listOfProducts[i].getProductInfoIva());
            System.out.println(listOfProducts[i].getProductInfoFull());*/
            System.out.println(listOfProducts[i].getProductInfoIvaFull());

            Categoria category = listOfProducts[i].getCategory();
            System.out.println(category.getCategoryName() + " : " + category.getItemDescription());
        }


    }
}
