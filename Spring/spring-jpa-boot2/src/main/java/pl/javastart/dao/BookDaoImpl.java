package pl.javastart.dao;

import org.springframework.stereotype.Repository;
import pl.javastart.model.Book;

import javax.persistence.*;

@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    private EntityManager entityManager;


    BookDaoImpl(){}


    @Override
    public void save(Book book) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(book);
        tx.commit();
        entityManager.close();
    }

    @Override
    public Book get(Long id) {
        Book book = entityManager.find(Book.class, id);
        entityManager.close();
        return book;
    }
}
