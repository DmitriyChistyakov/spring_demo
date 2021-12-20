package componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
    @Value("Иван")
    private String name;
//    @Autowired  //не совсем правильно, лучше на set
    private Home home;

//    public Person(){
//        System.out.println("Мой дом: " + home.getAddress());
//    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home getHome() {
        return home;
    }
    @Autowired
    public void setHome(Home home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", home=" + home.getAddress() +
                '}';
    }
}
