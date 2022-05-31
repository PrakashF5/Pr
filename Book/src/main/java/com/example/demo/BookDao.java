package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	BookDepo bdp;
	public String addInformation(BookEntity be) {
		bdp.save(be);
		return "data added";
	}
	public String updateInfo(BookEntity be) {
		bdp.save(be).getBookId();
		return "data has been updated";
	}
	public String deleteInfo(int BookId) {
		bdp.deleteById(BookId);
		return "data deleted";
	}
public List<BookEntity>getInformation() {
	return bdp.findAll();
}
}
