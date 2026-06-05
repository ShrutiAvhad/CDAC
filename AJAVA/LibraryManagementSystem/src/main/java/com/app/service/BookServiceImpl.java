package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.BookDAO;
import com.app.entity.Book;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO dao;

    @Override
    @Transactional
    public void saveBook(Book book) {

        dao.saveBook(book);
    }

    @Override
    @Transactional
    public List<Book> getBooks() {

        return dao.getBooks();
    }

    @Override
    @Transactional
    public Book getBook(int id) {

        return dao.getBook(id);
    }

    @Override
    @Transactional
    public void deleteBook(int id) {

        dao.deleteBook(id);
    }
}