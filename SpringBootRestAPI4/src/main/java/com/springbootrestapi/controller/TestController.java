package com.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.entites.BookEntites;
import com.springbootrestapi.service.BookService;

@RestController
public class TestController {
	  @Autowired
	    private BookService bookService;
	    
		@GetMapping("/books")
		 public List<BookEntites> getBooks()
		 {
			
			return this.bookService.getAllBooks();
		 }
		@PostMapping("/books")
		//aap key Request ma ju data aarah hai book key object data kon karega tu yaha per pass karna huga @RequestBody
		public BookEntites addBooks(@RequestBody BookEntites  book)
		{
			BookEntites booksTest=	this.bookService.addTestBook(book);
			System.out.println(book);
		    return booksTest;
		}
		@DeleteMapping("/books/{BookId}")
		public void deleteBook_a(@PathVariable("BookId")int book_id) {
			this.bookService.deleteBook_b(book_id);
			
			
		}


}
