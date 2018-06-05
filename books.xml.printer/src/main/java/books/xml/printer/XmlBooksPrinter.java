package books.xml.printer;

import books.printer.api.BookPrinter;
import books.storage.api.entities.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import static java.lang.System.getLogger;

public class XmlBooksPrinter implements BookPrinter {

    private static final String INTRODUCTION_MSG = "Hey! I am XML printer.";
    private final System.Logger LOG = getLogger(getClass().getName());

    @Override
    public void printBook(Book book) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(BookEntity.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.marshal(new BookEntity.BookEntityBuilder(book).build(), System.out);

        } catch (JAXBException e) {
            LOG.log(System.Logger.Level.WARNING, "Failed to print book details as XML", e);
        }
    }

    @Override
    public void printIntroductionMsg() {
        System.out.println(INTRODUCTION_MSG);
    }
}
