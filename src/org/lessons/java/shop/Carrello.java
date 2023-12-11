package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String>listOfProducts = new ArrayList<>();




        boolean wantInsert = false;
        while(!wantInsert){

            System.out.println("Aggiungere un prodotto? y/n");
            String responseAdd = scanner.nextLine();

            switch (responseAdd){
                case "y":
                    System.out.println("Indica che tipo di prodotto è tra: Smartphone, TV, Cuffie");
                    String typeOfProduct = scanner.nextLine();
                    if (typeOfProduct.equals("Smartphone")){
                        System.out.println("Inserisci il nome del prodotto");
                        String name = scanner.nextLine();
                        System.out.println("Inserisci una descrizione del prodotto");
                        String description = scanner.nextLine();
                        System.out.println("Di che categoria fa parte tra le seguenti? Casalinghi, Bricolage, Sport, Informatica");
                        String categoryName = scanner.nextLine();
                        System.out.println("Inserisci il prezzo del prodotto");
                        BigDecimal price = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
                        System.out.println("Inserisci l'iva da applicare al prodotto");
                        BigDecimal iva = BigDecimal.valueOf(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Inserisci la memoria del dispositivo");
                        int storage = Integer.parseInt(scanner.nextLine());

                        Categoria categoria = new Categoria(categoryName);
                        Prodotto product = new Smartphone(name, description, price, iva, categoria, storage);
                        listOfProducts.add(String.valueOf(product));}
//                    } else if (typeOfProduct.equals("TV")){
//                        System.out.println("Inserisci il nome del prodotto");
//                        String name = scanner.nextLine();
//                        System.out.println("Inserisci una descrizione del prodotto");
//                        String description = scanner.nextLine();
//                        System.out.println("Di che categoria fa parte tra le seguenti? Casalinghi, Bricolage, Sport, Informatica");
//                        String categoryName = scanner.nextLine();
//                        System.out.println("Inserisci il prezzo del prodotto");
//                        BigDecimal price = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
//                        System.out.println("Inserisci l'iva da applicare al prodotto");
//                        BigDecimal iva = BigDecimal.valueOf(Integer.parseInt(scanner.nextLine()));
//                        System.out.println("Inserisci i pollici del dispositivo");
//                        int pollici = Integer.parseInt(scanner.nextLine());
//                        boolean smart =
//
//                        Categoria categoria = new Categoria(categoryName);
//                        Prodotto product = new Smartphone(name, description, price, iva, categoria, pollici, smart);
//                        listOfProducts.add(String.valueOf(product));
//                    }
                case "n":
                    System.out.println("ok, I tuoi prodotti sono");
                    System.out.println(listOfProducts);
                    wantInsert = true;


            }




        }


        scanner.close();
    }
}
