package com.sumanth.projects.gql.gqlws.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.sumanth.projects.gql.gqlws.model.Book;
import com.sumanth.projects.gql.gqlws.repository.BookRepository;

import java.util.List;

public class Query implements GraphQLResolver {

    private final BookRepository bookRepository;

    public Query(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

}
