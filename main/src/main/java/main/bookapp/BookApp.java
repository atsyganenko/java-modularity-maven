package main.bookapp;

import books.inmemory.storage.service.guice.InMemoryStorageModule;
import books.printer.api.BookPrinter;
import books.storage.api.entities.Book;
import books.storage.api.service.BooksService;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.ServiceLoader;

public class BookApp {

    public static void main(String args[]) {

        Injector injector = Guice.createInjector(new InMemoryStorageModule());

        BooksService booksService = injector.getInstance(BooksService.class);

        int id = booksService.createBook("The Little Prince", 30.00);

        Book book = booksService.getBook(id);

        ServiceLoader.load(BookPrinter.class).forEach(printer -> {
            printer.printIntroductionMsg();
            printer.printBook(book);
        });

    }

}
