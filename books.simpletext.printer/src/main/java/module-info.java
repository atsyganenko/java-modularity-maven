module books.simpletext.printer {
    requires transitive books.printer.api;
    requires books.storage.api;

    exports books.simpletext.printer;

    provides books.printer.api.BookPrinter with books.simpletext.printer.SimpleTextBookPrinter;
}