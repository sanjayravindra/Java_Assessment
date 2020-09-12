package com.CodeChallenge;

import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book name:");
		String name = sc.next();
		System.out.println("Enter the price:");
		double price = sc.nextDouble();
		System.out.println("Enter the Author name:");
		String author = sc.next();
		Book b = new Book();
		b.setBookName(name);
		b.setBookPrice(price);
		b.setAuthorName(author);
		System.out.println("Book Details");
		System.out.println("Book Name : " + b.getBookName());
		System.out.println("Book Price : " + b.getBookPrice());
		System.out.println("Author Name : " + b.getAuthorName());
	}
}
