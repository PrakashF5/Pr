package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
@Autowired
BookService bs;
@PostMapping (value = "/addInfo")
public String addInformation(@RequestBody BookEntity be) {
	return bs.addInformation(be);
	
}

@PutMapping (value = "/update")
public String updateInfo(@RequestBody BookEntity be) {
	return bs.updateInfo(be);
}

@DeleteMapping (value = "/delete/{BookId}") 
public String deleteInfo(@PathVariable int BookId) {
	return bs.deleteInfo(BookId);
}

@GetMapping (value = "/info")
public List<BookEntity> getInformation() {
	return bs.getInformation();

}
}
