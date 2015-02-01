package vezzoni.jsf.spring.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import vezzoni.jsf.spring.services.GreetingsService;

@ManagedBean(name=HomeController.BEAN_NAME)
@RequestScoped
public class HomeController {

    public static final String BEAN_NAME  = "homeController";

    @ManagedProperty(value = "#{" + GreetingsService.COMP_NAME + "}")
    private GreetingsService service;
    
    private String grettings;

    public GreetingsService getService() {
        return service;
    }

    public void setService(GreetingsService service) {
        this.service = service;
    }

    public String getGrettings() {
        return grettings;
    }

    public void setGrettings(String grettings) {
        this.grettings = grettings;
    }

    public void sayHello() {
        this.grettings = this.service.sayHello();
    }
}
