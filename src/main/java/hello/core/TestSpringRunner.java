package hello.core;

import hello.core.config.SapConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestSpringRunner implements ApplicationRunner {

    @Autowired
    SapConfigurationProperties sapConfigurationProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(sapConfigurationProperties.getTestData());
        System.out.println(sapConfigurationProperties.getFilePath());


    }
}
