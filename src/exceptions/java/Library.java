package exceptions.java;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        try {
            Book ciao = new Book("dsdfgdsg",-2,"dasfasdf","dsafasdfas");
        } catch (Exception e) {
            e.getMessage();
        } finally {
            Book ciao = new Book("",0,"","");
            ciao.toString();
            System.out.println("FINE ");
        }

    }

}
