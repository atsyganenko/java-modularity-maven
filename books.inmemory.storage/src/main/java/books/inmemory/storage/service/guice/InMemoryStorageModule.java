package books.inmemory.storage.service.guice;

import books.inmemory.storage.service.InMemoryBooksService;
import books.storage.api.service.BooksService;
import com.google.inject.AbstractModule;

public class InMemoryStorageModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(BooksService.class).to(InMemoryBooksService.class);
    }
}
