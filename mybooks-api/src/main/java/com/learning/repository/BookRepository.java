package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	

}
