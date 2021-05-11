package lv.lu.kristaps.binde.finalwork;

import lv.lu.kristaps.binde.finalwork.ui.ConsulUi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class ProductAccountingApplication {

    public static void main(String[] args) {
   final ConfigurableApplicationContext context =
           SpringApplication.run(ProductAccountingApplication.class);
        context.getBean(ConsulUi.class).run();
    }

}