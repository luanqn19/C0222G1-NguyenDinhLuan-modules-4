package com.example.book.service.impl;

import com.example.book.model.Book;
import com.example.book.repository.IBookRepository;
import com.example.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;


    @Override
    public Page<Book> findAll (Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public Book detail (Long id) {
        return bookRepository.detail(id);
    }

    @Override
    public void save (Book book) {

    }
}
