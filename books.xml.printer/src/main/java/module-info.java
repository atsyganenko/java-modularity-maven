module books.xml.printer {
    requires books.printer.api;
    requires books.storage.api;
    requires java.xml.bind;


    opens books.xml.printer to java.xml.bind;

    provides books.printer.api.BookPrinter with books.xml.printer.XmlBooksPrinter;
}