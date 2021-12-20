package componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Home {
    @Value("Красная 2")
    private String address;
//    @Autowired  // не совсем правильно, лучше ставить на set
    private Person owner;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getOwner() {
        return owner;
    }

    @Autowired //здесь аннотация более правильно
    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Home{" +
                "address='" + address + '\'' +
                ", owner=" + owner.getName() +
                '}';
    }
}
