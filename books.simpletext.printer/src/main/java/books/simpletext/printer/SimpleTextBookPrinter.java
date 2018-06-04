package books.simpletext.printer;

import books.printer.api.BookPrinter;

public class SimpleTextBookPrinter implements BookPrinter {

    private static final String INTRODUCTION_MSG = "Hi! I am a Simple Printer. What can I print for you?";

    @Override
    public void printBook(books.storage.api.entities.Book book) {
        System.out.println(String.format("Book title: %s, price: %f \n", book.getTitle(), book.getPrice()));
    }

    @Override
    public void printIntroductionMsg() {
        System.out.println(INTRODUCTION_MSG);
    }
}
