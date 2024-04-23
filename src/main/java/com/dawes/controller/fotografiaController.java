package com.dawes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.ArbolVO;
import com.dawes.modelo.FotografiaVO;
import com.dawes.modelo.RecoleccionVO;
import com.dawes.modelo.TratamientoVO;
import com.dawes.servicio.ArbolServicio;
import com.dawes.servicio.FotografiaServicio;
@Controller
@RequestMapping("/fotografias")
public class fotografiaController {
	@Autowired
	FotografiaServicio fs;
	@Autowired
	ArbolServicio as;
	
	
	@RequestMapping("/mostrar")
	public String mostrar(Model model, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int pageSize) {
	    List<FotografiaVO> allFotografias = (List<FotografiaVO>) fs.findAll();
	    
	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) allFotografias.size() / pageSize);

		model.addAttribute("fotografias", fs.findAll());
		model.addAttribute("arboles", as.findAll());
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("pageSize", pageSize);
	    model.addAttribute("totalPages", totalPages); // Add totalPages to the model

	    return "fotografia/mostrar";
	}
	
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("fotografia", new FotografiaVO());
		modelo.addAttribute("arboles", as.findAll()); // Add the arboles attribute
		return "fotografia/forminsertar";
	}
	@RequestMapping("/insertar")
	public String forminsertar(@ModelAttribute FotografiaVO fotografia, Model modelo) {
		fs.save(fotografia);
		modelo.addAttribute("fotografias", fs.findAll());
		return  "redirect:/fotografias/mostrar";
	}
	@RequestMapping("/formmodificar")
	public String formmodificar(@RequestParam int idfotografia, Model modelo) {
		modelo.addAttribute("fotografia", fs.findById(idfotografia).get());
		modelo.addAttribute("arboles", as.findAll()); 
		return  "fotografia/formmodificar";
	}
	@RequestMapping("/modificar")
	public String modificar(@ModelAttribute FotografiaVO fotografia, Model modelo) {
	    fs.save(fotografia);
	    modelo.addAttribute("fotografias", fs.findAll());
	    return "redirect:/fotografias/mostrar";
	}
	


	@RequestMapping("/eliminar")
	public String formeliminar(@RequestParam int idfotografia, Model modelo) {
		fs.delete(fs.findById(idfotografia).get());
		modelo.addAttribute("fotografias", fs.findAll());
		return  "redirect:/fotografias/mostrar";
	}
}
