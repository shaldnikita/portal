package main.design;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.*;
import com.vaadin.ui.declarative.Design;

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class MainViewDesign extends VerticalLayout {
    protected MenuBar menu;
    //protected Panel content;
    protected FormLayout content;

    public MainViewDesign() {
        menu = new MenuBar();
        content = new FormLayout();
        addComponents(menu,content);
        //Design.read(this);
    }
}