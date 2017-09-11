package com.horizonshards.web.controllers;

import com.oracle.javafx.jmx.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/*
 * Created by csaba on 11/09/2017.
 */
@Controller
public class IndexController {

    public IndexController() {
    }

    @RequestMapping("/")
    String index(Model model, HttpSession session)  throws JSONException {


        return "index";
    }
}
