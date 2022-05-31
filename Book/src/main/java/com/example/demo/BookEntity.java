package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
	private String bookName;
	private String bookAuthor;
	private int bookPrice;
	
	public void setBookId(int bookid) {
		this.bookid = bookid;
	}
	public int getBookId() {
		return bookid;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookPrice() {
		return bookPrice;
	}

}
