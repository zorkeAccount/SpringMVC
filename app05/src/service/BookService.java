package service;

import domain.Book;
import domain.Category;

import java.util.List;

/**
 * Created by zhaoke on 2017/3/27.
 */
public interface BookService {
    List<Category> getAllCategories();
    Category getCategory(int id);
    List<Book> getAllBooks();
    Book save(Book book);
    Book update(Book book);
    Book get(long id);
    long getNextId();
}
