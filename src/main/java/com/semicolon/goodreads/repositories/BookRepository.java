package com.semicolon.goodreads.repositories;

import com.semicolon.goodreads.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
