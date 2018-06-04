package books.storage.api.service;

import books.storage.api.entities.Book;

public interface BooksService {
  Book getBook(int id);
  int createBook(String title, double price);
}
