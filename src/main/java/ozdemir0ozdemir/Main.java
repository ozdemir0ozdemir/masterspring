package ozdemir0ozdemir;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ozdemir0ozdemir.beans.Person;
import ozdemir0ozdemir.beans.Vehicle;

@Configuration
@ComponentScan
public class Main {


    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Main.class);


        System.out.println(context.getBean(Vehicle.class).hashCode());
        System.out.println(context.getBean(Vehicle.class).hashCode());

        context.registerShutdownHook();
    }
}
