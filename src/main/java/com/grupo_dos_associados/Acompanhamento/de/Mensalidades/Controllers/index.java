package com.grupo_dos_associados.Acompanhamento.de.Mensalidades.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class index {


    @GetMapping("/")
    String page (Model model) {
        String helloworld="Hello and welcome to mustache";
        model.addAttribute("message", helloworld);
        return "index";
    }

}
