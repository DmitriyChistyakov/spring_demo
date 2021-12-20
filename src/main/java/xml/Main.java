package xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        /** это не Inversion of Control*/
//        var cat = new Cat();
//        cat.setTitle("Мурзик");

        var context = new ClassPathXmlApplicationContext("spring-config.xml");
        /** ClassPathXmlApplicationContext ищет именно в resources */

        var beanNames  = context.getBeanDefinitionNames();

        for (var name : beanNames) {
            System.out.println(context.getBean(name));
        }

        Cat cat = context.getBean(Cat.class);

        System.out.println(cat);

        context.close();

    }


}
