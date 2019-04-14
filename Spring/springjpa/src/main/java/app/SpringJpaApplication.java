package app;

import app.config.JpaConfig;
import app.dao.BookDao;
import app.model.Book;
import org.hibernate.jpa.spi.JpaCompliance;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringJpaApplication {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringJpaApplication.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        //zapisujemy
        Book book = new Book("1234566789756543","Spring is so cool!","Javastart");
        bookDao.save(book);
        //odczytujemy
        Book bookGet = bookDao.get(1L);
        System.out.println(bookGet);

        Thread.sleep(5000);
        ctx.close();
    }
}
