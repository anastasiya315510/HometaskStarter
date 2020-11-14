package hometask.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserNameProperties.class)
public class IronBankStarterConfig {

    @Bean
    @ConditionalOnProperty("user.name")
    public IronBankApplicationListener ironBankApplicationListener(){
        return new IronBankApplicationListener();
    }

    @Bean
    public FrontEndControllerHandler frontEndControllerHandler(){
        return new FrontEndControllerHandler();
    }
}
