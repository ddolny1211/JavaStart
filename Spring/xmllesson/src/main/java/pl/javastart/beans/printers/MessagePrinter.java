package pl.javastart.beans.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.javastart.beans.decorators.MessageDecorator;
import pl.javastart.beans.producers.Message;
import pl.javastart.beans.producers.MessageProducer;
import pl.javastart.beans.producers.Producer;

@Component
public class MessagePrinter {

    @Autowired
    @Message(type = Message.MessageType.FILE)
    private MessageProducer producer;

    private MessageDecorator decorator;

    MessagePrinter(){}

    @Autowired
    public MessagePrinter(@Producer(type = Producer.ProducerType.FILE)MessageProducer producer){
        this.producer=producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageDecorator getDecorator() {
        return decorator;
    }
    @Autowired(required = false)
    public void setDecorator(MessageDecorator decorator) {
        this.decorator = decorator;
    }

    public void print(){
        String message = producer.getMessage();
        message = decorator!=null? decorator.decorate(message) : message;
        System.out.println(message);
    }
}
