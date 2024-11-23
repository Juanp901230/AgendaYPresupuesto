package com.SoftForAll.Planify;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/tareas")
    public String tareas(){
        return "tareas";
    }

    @GetMapping("/presupuesto")
    public String presupuesto(){
        return"presupuesto";
    }

}
