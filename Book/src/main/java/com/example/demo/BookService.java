package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class BookService {
	@Autowired
BookDao bd;
public String addInformation(BookEntity be) {
return bd.addInformation(be);
}
@PutMapping (value = "/update")
public String updateInfo(BookEntity be) {
	return bd.updateInfo(be);
}
public String deleteInfo(int BookId) {
	return bd.deleteInfo(BookId);
}
public List<BookEntity>getInformation() {
	return bd.getInformation();
}
}
