package annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Cat catBean() {
        var cat = new Cat();
        cat.setTitle("Мурзик");
        return cat;
    }


    @Bean
    public Home homeBean() {
        var home = new Home();
        home.setAddress("Красная 1");
        return home;
    }

    @Bean
    public Person homePerson(Home home) {
        var person = new Person();
        person.setName("Иван");
        person.setHome(home);
        home.setOwner(person);
        return person;

    }

}
