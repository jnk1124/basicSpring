package hello.core.config;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SapConfigurationPropertiesTest {

    @Autowired
    SapConfigurationProperties sapConfigurationProperties;

    @Test
    void readProperties(){
        Assertions.assertThat(sapConfigurationProperties.getFilePath()).isEqualTo("AUTO_PATH_NOCOMMIT_V6");
    }

}