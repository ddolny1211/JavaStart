package pl.javastart.aspekty;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import pl.javastart.aspekty.model.Book;
import pl.javastart.aspekty.service.GenericRepository;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class SpringAopApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAopApplication.class);

        GenericRepository<String, Book> repo = ctx.getBean(GenericRepository.class);

        repo.add(new Book("1234567890123", "Pierwsza", "Pierwszy autor"));
        repo.add(new Book("2345678901234", "Druga", "Drugi autor"));
        repo.add(new Book("3456789012345", "Trzecia", "Trzeci autor"));

        Book book = repo.get("1234567890123");
        System.out.println(book);

        ctx.close();
    }
}
