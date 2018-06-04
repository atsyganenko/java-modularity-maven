module books.inmemory.storage {
    requires books.storage.api;
    requires com.google.guice;
    exports books.inmemory.storage.service.guice;
    exports books.inmemory.storage.entities;
}