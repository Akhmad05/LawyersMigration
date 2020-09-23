package ru.scli.lawyersmigration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class migrationController {

    @GetMapping
    public String indexPage() {

        return "migration";
    }
}
