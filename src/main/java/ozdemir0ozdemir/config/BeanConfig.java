package ozdemir0ozdemir.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ozdemir0ozdemir.beans.Person;
import ozdemir0ozdemir.beans.Vehicle;

@Configuration
public class BeanConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public Vehicle vehicle() {
        return new Vehicle("Ferrari");
    }

    @Bean
    public Person person(Vehicle vehicle) {
        return new Person("Ozdemir", vehicle);
    }
}
