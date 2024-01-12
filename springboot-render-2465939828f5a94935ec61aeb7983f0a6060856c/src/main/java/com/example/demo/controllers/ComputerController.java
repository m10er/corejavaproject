package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.data.ComputerData;
import com.example.demo.models.Computer;


@Controller
public class ComputerController {

    ComputerData computerData = new ComputerData();

@GetMapping("/computer/view")
public String computerShow(Model model){
    
   
    model.addAttribute("comp",  computerData.getAllComputer());
    return "computer/showAll";
}

    
}
