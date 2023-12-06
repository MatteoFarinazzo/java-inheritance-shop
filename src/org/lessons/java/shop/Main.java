package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti prodotti vuoi inserire nella lista?");
        int productNumber = Integer.parseInt(scanner.nextLine());

        Prodotto[] listOfProducts = new Prodotto[productNumber];

        for (int i = 0; i < listOfProducts.length; i++) {
            System.out.println("Inserisci il nome del prodotto");
            String name = scanner.nextLine();
            System.out.println("Inserisci una descrizione del prodotto");
            String description = scanner.nextLine();
            System.out.println("Di che categoria fa parte tra le seguenti? Casalinghi, Bricolage, Sport, Informatica");
            String categoryName = scanner.nextLine();
            System.out.println("Inserisci il prezzo del prodotto");
            Double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Inserisci l'iva da applicare al prodotto");
            int iva = Integer.parseInt(scanner.nextLine());
            Categoria categoria = new Categoria(categoryName);
            Prodotto product = new Prodotto(name, description, price, iva);
            listOfProducts[i]= product;

        }

        System.out.println("I prodotti nel tuo carrello sono:");
        for (int i = 0; i < listOfProducts.length ; i++) {
            System.out.println(listOfProducts[i].getProductInfo() + listOfProducts[i]);
            System.out.println(listOfProducts[i].getProductInfoIva());
            System.out.println(listOfProducts[i].getProductInfoFull());
            System.out.println(listOfProducts[i].getProductInfoIvaFull());
        }



    }
}
