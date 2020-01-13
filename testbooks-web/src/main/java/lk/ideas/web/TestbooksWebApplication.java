package lk.ideas.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = {"lk.ideas"})
public class TestbooksWebApplication {

    private static final Logger logger = LoggerFactory.getLogger(TestbooksWebApplication.class);

    @PostConstruct
    public void postConstruct() {
        Runtime.getRuntime().addShutdownHook(new Thread(() ->
                logger.debug("!!!!!!!!!!! application shutdown !!!!!!!!!!!")
        ));
    }

    public static void main(String[] args) {
        SpringApplication.run(TestbooksWebApplication.class, args);
    }

}
