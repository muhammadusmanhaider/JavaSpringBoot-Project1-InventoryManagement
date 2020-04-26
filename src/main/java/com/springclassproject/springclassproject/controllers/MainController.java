package com.springclassproject.springclassproject.controllers;
import com.springclassproject.springclassproject.Models.Inventory;
import com.springclassproject.springclassproject.Models.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
import java.util.UUID;

@Controller
public class MainController {

    @Autowired
    InventoryRepo inventoryRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("inventorylist", inventoryRepo.findAll());
        return mv;
    }
}