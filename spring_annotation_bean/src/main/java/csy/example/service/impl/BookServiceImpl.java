package csy.example.service.impl;

import csy.example.service.BookService;
import org.springframework.stereotype.Component;

@Component("bookService")
public class BookServiceImpl implements BookService {

    @Override
    public void save() {
        System.out.println("book service save...");
    }
}
