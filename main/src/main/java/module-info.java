module main {
    requires books.inmemory.storage;
    requires books.printer.api;
    requires com.google.guice;
    uses books.printer.api.BookPrinter;
}