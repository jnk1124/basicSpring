package hello.core.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SapConfigurationPropertiesTest {

    @Autowired
    SapConfigurationProperties sapConfigurationProperties;

    @Test
    void readProperties(){
        System.out.println("SapConfigurationPropertiesTest.readProperties : " + sapConfigurationProperties.getFilePath());
    }

}