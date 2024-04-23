package com.dawes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.ArbolTratamientoVO;
import com.dawes.modelo.ArbolVO;
import com.dawes.modelo.TratamientoFincaVO;
import com.dawes.servicio.ArbolServicio;
import com.dawes.servicio.FincaServicio;
import com.dawes.servicio.VariedadServicio;

@Controller
@RequestMapping("/arboles")
public class arbolController {

	
	@Autowired
	ArbolServicio as;
	@Autowired
	FincaServicio fs;
	@Autowired
	VariedadServicio vs;
	 
	@RequestMapping("/mostrar")
	public String mostrar(Model model, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int pageSize) {
	    List<ArbolVO> allArboles = (List<ArbolVO>) as.findAll();
	    
	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) allArboles.size() / pageSize);

	    model.addAttribute("arboles", allArboles);
	    model.addAttribute("fincas", fs.findAll()); 
	    model.addAttribute("variedades", vs.findAll()); 
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("pageSize", pageSize);
	    model.addAttribute("totalPages", totalPages); // Add totalPages to the model

	    return "arbol/mostrar";
	}
	
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("arbol", new ArbolVO());
		modelo.addAttribute("fincas", fs.findAll()); 
	    modelo.addAttribute("variedades", vs.findAll()); 
	        return "arbol/forminsertar";
	}
	@RequestMapping("/insertar")
	public String forminsertar(@ModelAttribute ArbolVO arbol, Model modelo) {
		as.save(arbol);
		modelo.addAttribute("arboles", as.findAll());
		return  "redirect:/arboles/mostrar";
	}
	@RequestMapping("/formmodificar")
	public String formmodificar(@RequestParam int idarbol, Model modelo) {
		modelo.addAttribute("arbol", as.findById(idarbol).get());
		modelo.addAttribute("fincas", fs.findAll());
		modelo.addAttribute("variedades", vs.findAll());
		return  "arbol/formmodificar";
	}
	@RequestMapping("/modificar")
	public String modificar(@ModelAttribute ArbolVO arbol, Model modelo) {
	    as.save(arbol);
	    modelo.addAttribute("arboles", as.findAll());
	    return "redirect:/arboles/mostrar";
	}
	@RequestMapping("/eliminar")
	public String formeliminar(int idarbol, Model modelo) {
		as.delete(as.findById(idarbol).get());
		modelo.addAttribute("arboles", as.findAll());
		return  "redirect:/arboles/mostrar";
	}
	


}
