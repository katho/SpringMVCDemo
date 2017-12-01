package com.grupo4.controller;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.grupo4.pojo.Usuario;

@Controller
public class UsuarioController {

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("usuario", "usuario", new Usuario());
	}

	@RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		model.addAttribute("idusuario", usuario.getIdusuario());
		model.addAttribute("nombre_usuario", usuario.getNombre_usuario());
		return "usuario";

	}

	@RequestMapping("/usuario")
	public String showUsuario(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);

		return "index";
	}

	@RequestMapping(value = "/usuario/save", method = RequestMethod.POST)
	public String handleUsuario(@ModelAttribute("usuario") Usuario usuarioForm, Model model) 
	{
		model.addAttribute("usuarioForm",usuarioForm);
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		 
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Usuario user = new Usuario();
		user.setNombre_usuario(usuarioForm.getNombre_usuario());
		
		session.save(user);
		tr.commit();
		System.out.println("Se guardó satisfactoriamente");
		//sessionFactory.close();
		return "index";
	}
}
