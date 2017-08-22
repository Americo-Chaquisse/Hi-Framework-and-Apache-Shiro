package mz.co.web.controllers;

import org.emerjoin.hi.web.mvc.Controller;
import org.emerjoin.hi.web.mvc.exceptions.MvcException;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author Americo Chaquisse
 */
@ApplicationScoped
public class User extends Controller{

    public void login() throws MvcException {
        this.callView();
    }

}
