package books.printer.api;

import books.storage.api.entities.Book;

public interface BookPrinter {

    void printBook(Book book);

    void printIntroductionMsg();
}
