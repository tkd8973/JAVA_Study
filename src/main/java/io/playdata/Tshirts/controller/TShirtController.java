package io.playdata.Tshirts.controller;

import io.playdata.Tshirts.model.TShirt;
import io.playdata.Tshirts.service.TShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class TShirtController {
    @Autowired
    private TShirtService tShirtService;
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<TShirt> tShirts = tShirtService.getAllTShirts();
        model.addAttribute("tShirts", tShirts);
        model.addAttribute("message","티셔츠으으으");
        return "index";
    }
    @GetMapping("/showNewTShirtForm")
    public String showNewTShirtForm(Model model) {
        TShirt tShirt = new TShirt();
        model.addAttribute("tShirt", tShirt);
        return "new_tshirt";
    }
    @PostMapping("/saveTShirt")
    public String saveTShirt(@ModelAttribute("tShirt") TShirt tShirt) {
        tShirtService.addTShirt(tShirt);
        return "redirect:/";
    }
    @GetMapping("/showUpdateTShirtForm/{id}")
    public String showUpdateTShirtForm(@PathVariable(value = "id") Long id, Model model) {
        TShirt tShirt = tShirtService.getTShirtById(id);
        model.addAttribute("tShirt", tShirt);
        return "update_tshirt";
    }
    @PostMapping("/updateTShirt")
    public String updateTShirt(@ModelAttribute("tShirt") TShirt tShirt,
                               RedirectAttributes redirectAttributes) {
        tShirtService.updateTShirt(tShirt);
        redirectAttributes.addFlashAttribute("message2","수정이 댔냐??");
        return "redirect:/";
    }
    @GetMapping("/deleteTShirt/{id}")
    public String deleteTShirt(@PathVariable(value = "id") Long id,
                               RedirectAttributes redirectAttributes) {
        tShirtService.deleteTShirtById(id);
        redirectAttributes.addFlashAttribute("message2","삭제가 댔냐??");

        return "redirect:/";
    }
}