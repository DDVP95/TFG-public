package com.dawes.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.ArbolTratamientoVO;
import com.dawes.modelo.ArbolVO;
import com.dawes.servicio.ArbolServicio;
import com.dawes.servicio.ArbolTratamientoServicio;
import com.dawes.servicio.TratamientoServicio;

@Controller
@RequestMapping("/arboltratamientos")
public class arbolTratamientoController {

	
	@Autowired
	ArbolTratamientoServicio ats;
	
	@Autowired
	ArbolServicio as;
	
	@Autowired 
	TratamientoServicio ts;
	
	@RequestMapping("/mostrar")
	public String mostrar(Model model, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int pageSize) {
	    List<ArbolTratamientoVO> allArbolTratamientos = (List<ArbolTratamientoVO>) ats.findAll();
	    
	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) allArbolTratamientos.size() / pageSize);

	    model.addAttribute("arboltratamientos", allArbolTratamientos);
	    model.addAttribute("tratamientos", ts.findAll()); 
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("pageSize", pageSize);
	    model.addAttribute("totalPages", totalPages); // Add totalPages to the model

	    return "arboltratamiento/mostrar";
	}
	
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("arboltratamiento", new ArbolTratamientoVO());
		modelo.addAttribute("arboles", as.findAll()); 
	    modelo.addAttribute("tratamientos", ts.findAll()); 
	        return "arboltratamiento/forminsertar";
	}
	@RequestMapping("/insertar")
	public String forminsertar(@ModelAttribute ArbolTratamientoVO arboltratamiento, Model modelo) {
		ats.save(arboltratamiento);
		modelo.addAttribute("arboltratamientos", ats.findAll());
		return  "redirect:/arboltratamientos/mostrar";
	}
	@RequestMapping("/formmodificar")
	public String formmodificar(@RequestParam int idarboltratamiento, Model modelo) {
		modelo.addAttribute("arboltratamiento", ats.findById(idarboltratamiento).get());
		modelo.addAttribute("arboles", as.findAll()); 
	    modelo.addAttribute("tratamientos", ts.findAll()); 
		return  "arboltratamiento/formmodificar";
	}
	@RequestMapping("/modificar")
	public String modificar(@ModelAttribute  ArbolTratamientoVO arboltratamiento, Model modelo) {
		ats.save(arboltratamiento);
		modelo.addAttribute("arboles", as.findAll()); 
	    modelo.addAttribute("tratamientos", ts.findAll()); 
	    return "redirect:/arboltratamientos/mostrar";
	}

	@RequestMapping("/eliminar")
	public String formeliminar(int idarboltratamiento, Model modelo) {
		ats.delete(ats.findById(idarboltratamiento).get());
	    modelo.addAttribute("arboltratamientos", ats.findAll());
	    return "redirect:/arboltratamientos/mostrar";
	}

	
}