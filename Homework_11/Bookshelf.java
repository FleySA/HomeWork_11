package com.proftelran.org.Homework_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bookshelf {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add (new Book("- Легион - ", "Г. Климов",1923, 300, 2005, "Триумф.", 1995));
        books.add (new Book("- Война и мир - ", "Л. Толстой",1828, 250, 2010, "Азбука - Аттикус. ", 1989));
        books.add (new Book("- Бородино - ", "А. Пушкин",1799, 20, 2015, "Феникс.", 1999));
        books.add (new Book("- Для детей - ", "С. Маршак",1887, 120, 2020, "Азбука - Аттикус. ", 1989));
        books.add (new Book("- Стихи и сказки - ", "К.И. Чуковский",1882, 80, 2000, "Триумф.", 1995));
        books.add (new Book("- Мастер и Маргарита - ", "М. Булгаков",1891, 250, 2011, "Феникс.", 1999));
        books.add (new Book("- Сборник стихов - ", "С. Есенин",1895, 100, 2008, "Азбука - Аттикус. ", 1989));


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите критерий сортировки (1 - по фамилии автора, 2 - по году издания книги, 3 - по издательству, 4 - по году рождения автора, 0 - выход):");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    Collections.sort(books, Comparator.comparing(book -> book.getAuthorFullName()));
                    break;
                case 2:
                    Collections.sort(books, Comparator.comparingInt(book -> book.getPublicationYear()));
                    break;
                case 3:
                    Collections.sort(books, Comparator.comparing(book -> book.getPublisherName()));
                    break;
                case 4:
                    Collections.sort(books, Comparator.comparing(book -> book.getAuthor()));
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    break;
            }

            System.out.println("КНИГИ НА ПОЛКЕ:");
            for (Book book : books) {
                System.out.print(book.getAuthorFullName() + " "+ book.getAuthor() + "г.р."+ book.getTitle() );
                System.out.print(book.getPageCount() + "стр. ");
                System.out.print(book.getPublicationYear() + " год издания.");
                System.out.print(" Издательство: " + book.getPublisherName());
                System.out.print(" Год основания издательства: " + book.getPublisherFoundingYear());
                System.out.println();
            }
        }
    }
}
