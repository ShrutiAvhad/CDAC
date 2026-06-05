package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.app.entity.Book;
import com.app.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService service;

	@GetMapping("/list")
	public String listBooks(Model model) 
	{
		model.addAttribute("books", service.getBooks());

		return "list-books";
	}

	@GetMapping("/showForm")
	public String showForm(Model model)
	{
		model.addAttribute("book", new Book());

		return "book-form";
	}

	@PostMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") Book book)
	{
		service.saveBook(book);

		return "redirect:/book/list";
	}

	@GetMapping("/delete")
	public String deleteBook(@RequestParam("id") int id) 
	{
		service.deleteBook(id);

		return "redirect:/book/list";
	}
}