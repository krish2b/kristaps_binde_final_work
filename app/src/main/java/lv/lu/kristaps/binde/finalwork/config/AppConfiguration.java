package lv.lu.kristaps.binde.finalwork.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("lv.lu.kristaps.binde.finalwork")
public class AppConfiguration {

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }
}
