package hometask.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;



public class IronBankApplicationListener implements   ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    UserNameProperties user;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.err.println("Hello  "+ user.getName());
    }
}
