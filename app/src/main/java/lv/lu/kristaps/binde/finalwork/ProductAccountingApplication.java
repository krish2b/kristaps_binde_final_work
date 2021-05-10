package lv.lu.kristaps.binde.finalwork;

import lv.lu.kristaps.binde.finalwork.config.AppConfiguration;
import lv.lu.kristaps.binde.finalwork.ui.ConsulUi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductAccountingApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.getBean(ConsulUi.class).run();
    }
}
