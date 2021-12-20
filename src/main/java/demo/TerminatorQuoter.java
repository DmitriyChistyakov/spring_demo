package demo;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("t")
public class TerminatorQuoter implements Quoter{
    @RandomInt(min = 2, max = 5)
    private int count;

    @Override
    public String savQoute() {
        var sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("Я вернусь!!!!\n");
        }
        return sb.toString();
    }

    @PostConstruct
    public void init() {
        System.out.println("Init started");
        System.out.println("count = " + count);
        System.out.println("Init finished");

    }
}
