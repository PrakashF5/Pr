package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDepo extends JpaRepository<BookEntity, Integer> {

}
