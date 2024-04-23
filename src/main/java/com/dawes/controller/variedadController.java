package com.dawes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.FincaVO;
import com.dawes.modelo.RecoleccionVO;
import com.dawes.modelo.VariedadVO;
import com.dawes.servicio.VariedadServicio;


@Controller
@RequestMapping("/variedades")
public class variedadController {
	

	@Autowired
	VariedadServicio vs;
	 
	@RequestMapping("/mostrar")
	public String mostrar(Model model, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int pageSize) {
	    List<VariedadVO> allVariedades = (List<VariedadVO>) vs.findAll();
	    
	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) allVariedades.size() / pageSize);

		model.addAttribute("variedades", vs.findAll());
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("pageSize", pageSize);
	    model.addAttribute("totalPages", totalPages); // Add totalPages to the model

	    return "variedad/mostrar";
	}
	
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("variedad", new VariedadVO());
		return "variedad/forminsertar";
	}
	@RequestMapping("/insertar")
	public String forminsertar(@ModelAttribute VariedadVO variedad, Model modelo) {
		vs.save(variedad);
		modelo.addAttribute("variedades", vs.findAll());
		return  "redirect:/variedades/mostrar";
	}
	@RequestMapping("/formmodificar")
	public String formmodificar(@RequestParam int idvariedad, Model modelo) {
		modelo.addAttribute("variedad", vs.findById(idvariedad).get());
		return  "variedad/formmodificar";
	}
	
	@RequestMapping("/modificar")
	public String modificar(@ModelAttribute VariedadVO variedad, Model modelo) {
	    // Logic to update the finca entity
		vs.save(variedad);
	    modelo.addAttribute("variedades", vs.findAll());
	    return "redirect:/variedades/mostrar";
	}
	@RequestMapping("/eliminar")
	public String formeliminar(int idvariedad, Model modelo) {
		vs.delete(vs.findById(idvariedad).get());
		modelo.addAttribute("variedades", vs.findAll());
		return  "redirect:/variedades/mostrar";
	}
	
	
}
