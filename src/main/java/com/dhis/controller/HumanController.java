package com.dhis.controller;

import com.dhis.model.Human;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dehan on 6/5/16.
 */
@RestController
public class HumanController {
    @RequestMapping("/human")
    public List<Human> getEvents() {

        List<Human> humans = new ArrayList<Human>();
        humans.add(new Human("Mark",29,"Male"));
        humans.add(new Human("Dehan",24,"Male"));
        humans.add(new Human("Philangi",30,"Female"));

        return humans;

    }
}