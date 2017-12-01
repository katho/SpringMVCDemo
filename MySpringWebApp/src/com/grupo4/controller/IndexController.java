package com.grupo4.controller;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.grupo4.pojo.Usuario;

@Controller
//@SessionAttributes({"resultado", "attrib1", "attrib2"})
@SessionAttributes("resultado")
public class IndexController 
{
	@RequestMapping("/")
	public String showIndex(Model model)
	{
		model.addAttribute("resultado", "Atributo de Session");
		return "index";
	}
	
	@RequestMapping("/about")
	public String showAbout(/*SessionStatus status*/ Model model)
	{
		model.addAttribute("mensaje", "Atributo de about");
		//status.setComplete();
		return "about";
	}
	
	@RequestMapping("/admin")
	public String showAdmin(Model model)
	{
		model.addAttribute("mensaje", "Hola desde admin");
		model.addAttribute("resultado", "Atributo de Session");
		
		return "admin";
	}
	
	
	
	
}
