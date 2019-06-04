package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.dao.UserDao;
import pl.javastart.dao.UserDetailsDao;
import pl.javastart.model.User;
import pl.javastart.model.UserDetails;

@SpringBootApplication
public class SpringJpaRelatonsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=
                SpringApplication.run(SpringJpaRelatonsApplication.class, args);

//        UserDao userDao = ctx.getBean(UserDao.class);
//        User user = new User("johnny234","strongPass","johnny@gmail.com");
//        //zapisujemy obiekt bez userDetails
//        userDao.save(user);
//
//        //dodajemy szczegóły do obiektu
//        UserDetails details = new UserDetails("John","Kowalski","Krakowska 55, Warszawa");
//        user.setDetails(details);
//        userDao.update(user);
//
//        //aktualizujemy haslo oraz imie
//        user.setPassword("passPass");
//        user.getDetails().setFirstName("Piotr");
//        userDao.update(user);
//
//        //pobieramy aktualny stan obiektu z bazy i wyświetlamy go
//        User userFromDb = userDao.get(1L);
//        System.out.println(userFromDb);
//
//        //usuwamy obiekt z bazy
//        userDao.delete(user);
//
//        //ponownie pobieramy obiekt z bazy i wyświetlamy
//        userFromDb=userDao.get(1L);
//        System.out.println(userFromDb);

        UserDao userDao = ctx.getBean(UserDao.class);
        User user = new User("johnny234", "strongPass", "johnny@gmail.com");
        UserDetails userDetails = new UserDetails("John", "Kowalski", "Krakowska 55, Warszawa");
        user.setDetails(userDetails);
        userDao.save(user);

        UserDetailsDao userDetailsDao = ctx.getBean(UserDetailsDao.class);
        UserDetails getUserDetails = userDetailsDao.get(1L);
        System.out.println(getUserDetails.getUser());

        ctx.close();
    }

}
