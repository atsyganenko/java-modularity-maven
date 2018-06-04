package books.json.printer;

import books.printer.api.BookPrinter;
import books.storage.api.entities.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static java.lang.System.Logger;
import static java.lang.System.getLogger;

public class JsonBookPrinter implements BookPrinter {

    private static final String INTRODUCTION_MSG = "Hi! I am a fancy JSON Printer. Try me:)";
    private final Logger LOG = getLogger(getClass().getName());

    @Override
    public void printBook(Book book) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println(objectMapper.writeValueAsString(book) + "\n");
        } catch (JsonProcessingException e) {
            LOG.log(Logger.Level.WARNING, "Failed to print book details as JSON", e);
        }
    }

    @Override
    public void printIntroductionMsg() {
        System.out.println(INTRODUCTION_MSG);
    }
}
