package pl.javastart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javastart.beans.MessagePrinter;
import pl.javastart.beans.MessageProducer;

@Configuration
@ComponentScan
public class SpringDiApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDiApplication.class);

        MessageProducer bean1 = ctx.getBean(MessageProducer.class);
        System.out.println(bean1.getNumber());

        MessageProducer bean2 = ctx.getBean(MessageProducer.class);
        System.out.println(bean2.getNumber());

        MessagePrinter bean3 = ctx.getBean(MessagePrinter.class);
        bean3.printMessage();

        MessagePrinter bean4 = ctx.getBean(MessagePrinter.class);
        bean4.printMessage();

        ctx.close();
    }
}
