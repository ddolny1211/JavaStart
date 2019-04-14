package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.dao.BookDao;
import pl.javastart.model.Book;

@SpringBootApplication(scanBasePackages = "pl.javastart")
public class SpringJpaBoot2Application {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(SpringJpaBoot2Application.class, args);

        BookDao dao = ctx.getBean(BookDao.class);
        Book book = new Book("123459876","SpringBoot test","nonOficialJS");
        dao.save(book);
        Thread.sleep(5000);
    }

}
