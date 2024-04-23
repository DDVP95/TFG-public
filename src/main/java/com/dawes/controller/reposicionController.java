package com.dawes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.RecoleccionVO;
import com.dawes.modelo.ReposicionVO;
import com.dawes.servicio.ArbolServicio;
import com.dawes.servicio.ReposicionServicio;



@Controller
@RequestMapping("/reposiciones")
public class reposicionController {
	
	@Autowired
	ArbolServicio as;

	@Autowired
	ReposicionServicio rs;
	 
	@RequestMapping("/mostrar")
	public String mostrar(Model model, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int pageSize) {
	    List<ReposicionVO> allReposiciones = (List<ReposicionVO>) rs.findAll();
	    
	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) allReposiciones.size() / pageSize);

	    model.addAttribute("reposiciones", allReposiciones);
	    model.addAttribute("arboles", as.findAll());
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("pageSize", pageSize);
	    model.addAttribute("totalPages", totalPages); // Add totalPages to the model

	    return "reposicion/mostrar";
	}
	
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("reposicion", new ReposicionVO());
	    modelo.addAttribute("arboles", as.findAll()); 
	        return "reposicion/forminsertar";
	}
	@RequestMapping("/insertar")
	public String forminsertar(@ModelAttribute ReposicionVO reposicion, Model modelo) {
		rs.save(reposicion);
		modelo.addAttribute("reposiciones", rs.findAll());
		return  "redirect:/reposiciones/mostrar";
	}
	@RequestMapping("/formmodificar")
	public String formmodificar(@RequestParam int idreposicion, Model modelo) {
		modelo.addAttribute("reposicion", rs.findById(idreposicion).get());
		modelo.addAttribute("arboles", as.findAll()); 
		return  "reposicion/formmodificar";
	}
	@RequestMapping("/modificar")
	public String modificar(@ModelAttribute ReposicionVO reposicion, Model modelo) {
	    rs.save(reposicion);
	    modelo.addAttribute("reposiciones", rs.findAll());
	    return "redirect:/reposiciones/mostrar";
	}
	@RequestMapping("/eliminar")
	public String formeliminar(@RequestParam int idreposicion, Model modelo) {
		rs.delete(rs.findById(idreposicion).get());
		modelo.addAttribute("reposiciones", rs.findAll());
		return  "redirect:/reposiciones/mostrar";
	}
}
