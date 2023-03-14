package exceptions.java;

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

        for (int j = 0; j < books.length; j++) {
            System.out.println(books[j].toString());
            System.out.println();
        }

        scan.close();

    }

}
