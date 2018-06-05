package books.xml.printer;

import books.storage.api.entities.Book;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BookEntity implements Book {

    private int id;
    private String title;
    private double price;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    static class BookEntityBuilder {
        private BookEntity entity;

        BookEntityBuilder(Book book) {
            entity = new BookEntity();
            this.entity.setId(book.getId());
            this.entity.setPrice(book.getPrice());
            this.entity.setTitle(book.getTitle());
        }

        BookEntity build() {
            return entity;
        }
    }
}
