package hello.core.beanfind;

import hello.core.config.SapConfigurationProperties;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ApplicationExtendsFindTest {

    @Autowired
    SapConfigurationProperties sapConfigurationProperties;

    @Test
    void properties(){

        System.out.println(sapConfigurationProperties.getFilePath());
        System.out.println(sapConfigurationProperties.getTestData());
    }




    @Configuration
    static class TestConfig{

        @Bean
        public DiscountPolicy rateDiscountPolicy(){
            return new RateDiscountPolicy();
        }

        @Bean
        public DiscountPolicy FixDiscountPolicy(){
            return new FixDiscountPolicy();
        }
    }


}
