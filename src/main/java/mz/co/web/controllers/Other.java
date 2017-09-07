package mz.co.web.controllers;

import org.apache.shiro.SecurityUtils;
import org.emerjoin.hi.web.mvc.Controller;
import org.emerjoin.hi.web.mvc.exceptions.MvcException;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Americo Chaquisse
 */
@ApplicationScoped
public class Other extends Controller{

    public void index() throws MvcException {

        String currentUser = (String) SecurityUtils.getSubject().getPrincipal();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", currentUser);

        this.callView(map);

    }
}
