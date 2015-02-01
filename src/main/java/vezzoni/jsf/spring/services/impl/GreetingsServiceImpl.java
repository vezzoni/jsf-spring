package vezzoni.jsf.spring.services.impl;

import vezzoni.jsf.spring.services.GreetingsService;
import org.springframework.stereotype.Service;

@Service(value=GreetingsService.COMP_NAME)
public class GreetingsServiceImpl implements GreetingsService {

    @Override
    public String sayHello() {
        return "hi there!";
    }

}
