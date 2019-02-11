package com.sumanth.projects.gql.gqlws.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.sumanth.projects.gql.gqlws.model.Book;
import com.sumanth.projects.gql.gqlws.repository.BookRepository;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
public class BookResolver implements GraphQLResolver<Book> {

    @Inject
    private BookRepository bookRepository;

    void BookResolver(BookRepository repository) {
        this.bookRepository = repository;
    }

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }
}
