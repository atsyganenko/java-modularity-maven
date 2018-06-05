module books.json.printer {

    requires books.printer.api;
    requires java.logging;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires books.storage.api;

    exports books.json.printer;


    provides books.printer.api.BookPrinter with books.json.printer.JsonBookPrinter;
}