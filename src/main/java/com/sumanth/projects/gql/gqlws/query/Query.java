package com.sumanth.projects.gql.gqlws.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.sumanth.projects.gql.gqlws.model.Book;
import com.sumanth.projects.gql.gqlws.repository.BookRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private final BookRepository bookRepository;

    public Query(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

}
