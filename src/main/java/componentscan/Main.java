package componentscan;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var beanNames  = context.getBeanDefinitionNames();

        for (var name : beanNames) {
            System.out.println(context.getBean(name));
        }

        Cat cat = context.getBean(Cat.class);

        System.out.println(cat);


        var cat1 = context.getBean(Cat.class);
        var cat2 = context.getBean(Cat.class);
        cat1.setTitle("Барсик");

        System.out.println(cat1);
        System.out.println(cat2);

        context.close();

    }


}
