package demo.controller;

import demo.entity.Dummy;
import demo.entity.service.EmployeeService;
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

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/findAllEmployees", method = RequestMethod.POST)
    public String findAllEmployee() {
        return "fn(" + employeeService.findAll() + ")";
    }

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
