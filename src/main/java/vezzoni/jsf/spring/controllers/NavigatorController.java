package vezzoni.jsf.spring.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name=NavigatorController.BEAN_NAME)
@RequestScoped
public class NavigatorController {

    public static final String BEAN_NAME  = "navigatorController";

    public String home() {
        return "home";
    }

    public String settings() {
        return "settings";
    }
}
