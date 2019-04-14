package main;

import dao.BookDao;
import dao.BookDaoImpl;
import model.Book;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("123456789","Wilk z Wall Street", "Jordan Belfrot");
        Book bok = new Book("92982888321","Why we sins?", "Jesus Christ");
        BookDao bookDao = new BookDaoImpl();
        bookDao.save(book);
        bookDao.save(bok);
        System.out.println("Book loadeed");
        Book book1 = bookDao.get(2L);
        System.out.println(book1);
        bookDao.cleanUp();
    }
}
