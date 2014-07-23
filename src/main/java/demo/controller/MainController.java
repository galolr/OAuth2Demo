package demo.controller;

import demo.entity.Dummy;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

/**
 * Created by gersomlopez on 7/22/14.
 */

@RestController
@RequestMapping("/resources")
public class MainController {

    @Autowired
    private Dummy dummy;

    @RequestMapping
    public String main() {
        return "WORKS!!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/demo")
    public String welcome() {
        return "WELCOME TO /demo!!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{name}")
    public Dummy welcome(@PathVariable String name) {
        dummy.setName(name);
        return dummy;
    }

    @RequestMapping(value = "/last")
    public Dummy last() {
        return dummy;
    }
}
