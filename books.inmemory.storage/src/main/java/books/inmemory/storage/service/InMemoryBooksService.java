package books.inmemory.storage.service;

import books.inmemory.storage.entities.BookEntity;
import books.storage.api.entities.Book;
import books.storage.api.service.BooksService;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryBooksService implements BooksService {
  private final static BooksService instance = new InMemoryBooksService();

  private AtomicInteger nextId = new AtomicInteger();
  private ConcurrentHashMap<Integer, Book> books = new ConcurrentHashMap<>();

  public Book getBook(int id) {
    return books.get(id);
  }

  public int createBook(String title, double price) {
    int id = nextId.incrementAndGet();
    books.put(id, new BookEntity(id, title, price));
    return id;
  }

  public static BooksService provider() {
    return instance;
  }

}
