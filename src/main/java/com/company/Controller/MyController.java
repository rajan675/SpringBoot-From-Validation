package com.company.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.company.Entities.LoginData;

import jakarta.validation.Valid;

@Controller
public class MyController {
	@GetMapping("/form")
	public String openForm(Model model) {
		model.addAttribute("loginData", new LoginData());
		return "form";
	} 
	@PostMapping("/submit")
    public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult bindingResult) {
       
		if (bindingResult.hasErrors()) {
            // Validation failed, return to the form with error messages
            System.out.println(bindingResult);
            return "form";
        }
        // Process the valid form data
		System.out.println(loginData);
        return "submitValue"; // Redirect to a success page
    }
	/*
	@PostMapping("/submit")
	public String formData(@ModelAttribute("loginData") LoginData loginData ) {
		System.out.println(loginData);
		return "submitValue"; 
	}
	
	@GetMapping("/about") 
	public String about(Model model) {
		model.addAttribute("name", "This is me");
		return "about";
	}
	*/
}
