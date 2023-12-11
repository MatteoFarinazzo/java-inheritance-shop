package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Prodotto> listOfProducts = new ArrayList<>();


        boolean wantInsert = false;
        while (!wantInsert) {

            System.out.println("Aggiungere un prodotto? y/n");
            String responseAdd = scanner.nextLine();

                if (responseAdd.equals("y")) {

                    System.out.println("Indica che tipo di prodotto è tra: Smartphone, TV, Cuffie");
                    String typeOfProduct = scanner.nextLine();

                    if (typeOfProduct.equals("Smartphone")) {
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
                        listOfProducts.add(product);

                    } else if (typeOfProduct.equals("TV")) {
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
                        System.out.println("Inserisci i pollici del dispositivo");
                        int pollici = Integer.parseInt(scanner.nextLine());
                        System.out.println("Il TV è smart? y/n");
                        String smart = scanner.nextLine();

                        Categoria categoria = new Categoria(categoryName);
                        Prodotto product = new TV(name, description, price, iva, categoria, pollici, smart);
                        listOfProducts.add(product);

                    } else if (typeOfProduct.equals("Cuffie")) {
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
                        System.out.println("Inserisci il colore del dispositivo");
                        String color = scanner.nextLine();
                        System.out.println("sono wireless? y/n");
                        String wireless = scanner.nextLine();

                        Categoria categoria = new Categoria(categoryName);
                        Prodotto product = new Cuffie(name, description, price, iva, categoria, color, wireless);
                        listOfProducts.add(product);

                    } else {
                        System.out.println("Inserisci il nome del prodotto");
                        String name = scanner.nextLine();
                        //Il nome del prodotto non può essere vuoto

                        System.out.println("Inserisci una descrizione del prodotto");
                        String description = scanner.nextLine();
                        System.out.println("Di che categoria fa parte tra le seguenti? Casalinghi, Bricolage, Sport, Informatica");
                        String categoryName = scanner.nextLine();
                        System.out.println("Inserisci il prezzo del prodotto");
                        BigDecimal price = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
                        System.out.println("Inserisci l'iva da applicare al prodotto");
                        BigDecimal iva = BigDecimal.valueOf(Integer.parseInt(scanner.nextLine()));
                        Categoria categoria = new Categoria(categoryName);
                        Prodotto product = new Prodotto(name, description, price, iva, categoria);
                        listOfProducts.add(product);
                    }

                }else if(responseAdd.equals("n")){
                    System.out.println("ok");
                    wantInsert = true;
                } else {
                    System.out.println("La risposta non è valida");
                }
        }

        System.out.println("I prodotti nel tuo carrello sono:");

        for (Prodotto prodotto: listOfProducts) {
            Categoria category = prodotto.getCategory();
            System.out.println(category.getCategoryName() + " : " + category.getItemDescription());
            System.out.println(prodotto);


        }





        scanner.close();
    }
}
