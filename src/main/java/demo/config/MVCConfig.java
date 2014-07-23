package demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by gersomlopez on 7/22/14.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "demo.controller")
public class MVCConfig {
}
