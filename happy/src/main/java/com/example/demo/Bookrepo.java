package com.example.demo;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import javax.persistence.QueryHint;

public interface Bookrepo  extends CrudRepository<Book, Integer>{
	
	/*@Query(value="SELECT t FROM Book t LOWER(t.title) LIKE LOWER(CONCAT('%',:searcht, '%')) ")
    public List<Book> findByTitle(@Param("searcht") String searcht);
	*/
	public List<Book> findBytitle(String title);
}