package com.sumanth.projects.gql.gqlws.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sumanth.projects.gql.gqlws.model.Book;
import com.sumanth.projects.gql.gqlws.resolver.BookResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private final BookResolver bookResolver;

    public Query(BookResolver bookResolver) {
        this.bookResolver = bookResolver;
    }

    public List<Book> getBooks() {
        return bookResolver.getBooks();
    }

}
