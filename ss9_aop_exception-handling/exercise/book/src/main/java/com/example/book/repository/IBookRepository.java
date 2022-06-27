package com.example.book.repository;

import com.example.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBookRepository extends JpaRepository<Book, Long> {
    @Query(value = "SELECT * FROM book WHERE id_book = :id", nativeQuery = true)
    Book detail (@Param("id") Long id);
}
