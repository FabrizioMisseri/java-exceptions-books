package exceptions.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//        String title;
//        int pageNumber;
//        String author;
//        String publisher;

public class Library {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Benvenuto in SASSONEshop.com, qunati libri vuoi inserire?");

        int booksLength = Integer.parseInt(scan.nextLine());
        Book[] books = new Book[booksLength];
        int i = 0;

            while (i < booksLength) {
                try {
                    System.out.println("inserisci titolo:");
                    String title = scan.nextLine();
                    System.out.println("inserisci numero pagine:");
                    int pageNumber = Integer.parseInt(scan.nextLine());
                    System.out.println("inserisci autore:");
                    String author = scan.nextLine();
                    System.out.println("inserisci titolo:");
                    String publisher = scan.nextLine();
                    Book book = new Book(title, pageNumber, author, publisher);
                    books[i] = book;
                    i++;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
        scan.close();

        String stringL = "";

        for (int j = 0; j < books.length; j++) {
            stringL += books[j].toString();
        }

        File file = new File("boh.txt");

        try {
            FileWriter newFile = new FileWriter(file, true);
            newFile.write(stringL);
            newFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("fine");

    }

}
