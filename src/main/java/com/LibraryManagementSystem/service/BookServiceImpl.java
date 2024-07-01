package com.LibraryManagementSystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibraryManagementSystem.model.Book;
import com.LibraryManagementSystem.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null);
    }
  

   

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
		
	}

	@Override
	public Book updateBook(Long id, Book book) {
		// TODO Auto-generated method stub
		  Book existingBook = getBookById(id);
	        if (existingBook != null) {
	            existingBook.setTitle(book.getTitle());
	            existingBook.setAuthor(book.getAuthor());
	            existingBook.setIsbn(book.getIsbn());
	            
	}
	        return bookRepository.save(existingBook);
	}
	}

