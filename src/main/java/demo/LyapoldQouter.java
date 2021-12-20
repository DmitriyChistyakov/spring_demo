package demo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("l")
//@Primary
public class LyapoldQouter implements Quoter{
    @Override
    public String savQoute() {
        return "Давайте ЖИТЬ!";
    }
}
