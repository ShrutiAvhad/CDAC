package com.app.dao;

import java.util.List;

import com.app.entity.Book;

public interface BookDAO {

	void saveBook(Book book);

	List<Book> getBooks();

	Book getBook(int id);

	void deleteBook(int id);
}
