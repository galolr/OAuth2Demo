package demo.config;

import demo.entity.Dummy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gersomlopez on 7/22/14.
 */

@Configuration
public class CoreConfig {
    @Bean
    public Dummy createDummy() {
        return new Dummy();
    }

}
