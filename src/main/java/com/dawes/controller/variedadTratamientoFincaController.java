package com.dawes.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.ReposicionVO;
import com.dawes.modelo.VariedadTratamientoFincaVO;
import com.dawes.servicio.FincaServicio;
import com.dawes.servicio.TratamientoServicio;
import com.dawes.servicio.VariedadServicio;
import com.dawes.servicio.VariedadTratamientoFincaServicio;

@Controller
@RequestMapping("/variedadtratamientofincas")
public class variedadTratamientoFincaController {

	
	@Autowired
	VariedadTratamientoFincaServicio vtfs;
	
	@Autowired
	VariedadServicio vs;
	
	@Autowired 
	FincaServicio fs;
	@Autowired 
	TratamientoServicio ts;
	
	@RequestMapping("/mostrar")
	public String mostrar(Model model, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int pageSize) {
	    List<VariedadTratamientoFincaVO> allVariedadTratamientoFincas = (List<VariedadTratamientoFincaVO>) vtfs.findAll();
	    
	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) allVariedadTratamientoFincas.size() / pageSize);

	    model.addAttribute("variedadtratamientofincas", allVariedadTratamientoFincas);
	    model.addAttribute("variedades", vs.findAll()); 
	    model.addAttribute("fincas", fs.findAll()); 
	    model.addAttribute("tratamientos", ts.findAll()); 
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("pageSize", pageSize);
	    model.addAttribute("totalPages", totalPages); // Add totalPages to the model

	    return "variedadtratamientofinca/mostrar";
	}
	
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("variedadtratamientofinca", new VariedadTratamientoFincaVO());
	    modelo.addAttribute("variedades", vs.findAll()); 
	    modelo.addAttribute("fincas", fs.findAll()); 
	    modelo.addAttribute("tratamientos", ts.findAll()); 
	        return "variedadtratamientofinca/forminsertar";
	}
	@RequestMapping("/insertar")
	public String forminsertar(@ModelAttribute VariedadTratamientoFincaVO variedadtratamientofinca, Model modelo) {
		vtfs.save(variedadtratamientofinca);
		modelo.addAttribute("variedadtratamientofincas", vtfs.findAll());
		return  "redirect:/variedadtratamientofincas/mostrar";
	}
	@RequestMapping("/formmodificar")
	public String formmodificar(@RequestParam int idvariedadtratamientofinca, Model modelo) {
		modelo.addAttribute("variedadtratamientofinca", vtfs.findById(idvariedadtratamientofinca).get());
		modelo.addAttribute("variedades", vs.findAll()); 
	    modelo.addAttribute("fincas", fs.findAll());
	    modelo.addAttribute("tratamientos", ts.findAll());
		return  "variedadtratamientofinca/formmodificar";
	}
	@RequestMapping("/modificar")
	public String modificar(@ModelAttribute  VariedadTratamientoFincaVO variedadtratamientofinca, Model modelo) {
		vtfs.save(variedadtratamientofinca);
		modelo.addAttribute("variedades", vs.findAll()); 
	    modelo.addAttribute("fincas", fs.findAll());
	    modelo.addAttribute("tratamientos", ts.findAll());
	    return "redirect:/variedadtratamientofincas/mostrar";
	}

	@RequestMapping("/eliminar")
	public String formeliminar(int idvariedadtratamientofinca, Model modelo) {
		vtfs.delete(vtfs.findById(idvariedadtratamientofinca).get());
	    modelo.addAttribute("variedadtratamientofinca", vtfs.findAll());
	    return "redirect:/variedadtratamientofincas/mostrar";
	}

	
}