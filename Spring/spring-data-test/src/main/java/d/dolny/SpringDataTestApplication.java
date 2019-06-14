package d.dolny;

import d.dolny.model.Car;
import d.dolny.repository.CarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(SpringDataTestApplication.class, args);

        Car car = new Car("Audi","A5",49000.0);
        CarRepository carRepo = ctx.getBean(CarRepository.class);

        carRepo.save(car);

        ctx.close();
    }

}
