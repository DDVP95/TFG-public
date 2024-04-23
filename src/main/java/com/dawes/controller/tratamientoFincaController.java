package com.dawes.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.TratamientoFincaVO;
import com.dawes.modelo.VariedadTratamientoFincaVO;
import com.dawes.servicio.FincaServicio;
import com.dawes.servicio.TratamientoFincaServicio;
import com.dawes.servicio.TratamientoServicio;

@Controller
@RequestMapping("/tratamientofincas")
public class tratamientoFincaController {

	
	@Autowired
	TratamientoFincaServicio tfs;
	@Autowired 
	TratamientoServicio ts;
	@Autowired 
	FincaServicio fs;
	
	
	@RequestMapping("/mostrar")
	public String mostrar(Model model, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int pageSize) {
	    List<TratamientoFincaVO> allTratamientoFincas = (List<TratamientoFincaVO>) tfs.findAll();
	    
	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) allTratamientoFincas.size() / pageSize);

	    model.addAttribute("tratamientofincas", allTratamientoFincas);
	    model.addAttribute("fincas", fs.findAll()); 
	    model.addAttribute("tratamientos", ts.findAll()); 
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("pageSize", pageSize);
	    model.addAttribute("totalPages", totalPages); // Add totalPages to the model

	    return "tratamientofinca/mostrar";
	}
	
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("tratamientofinca", new TratamientoFincaVO());
	    modelo.addAttribute("fincas", fs.findAll()); 
	    modelo.addAttribute("tratamientos", ts.findAll()); 
	        return "tratamientofinca/forminsertar";
	}
	@RequestMapping("/insertar")
	public String forminsertar(@ModelAttribute TratamientoFincaVO tratamientofinca, Model modelo) {
		tfs.save(tratamientofinca);
		modelo.addAttribute("tratamientofincas", tfs.findAll());
		return  "redirect:/tratamientofincas/mostrar";
	}
	@RequestMapping("/formmodificar")
	public String formmodificar(@RequestParam int idtratamientofinca, Model modelo) {
		modelo.addAttribute("tratamientofinca", tfs.findById(idtratamientofinca).get());
	    modelo.addAttribute("fincas", fs.findAll());
	    modelo.addAttribute("tratamientos", ts.findAll());
		return  "tratamientofinca/formmodificar";
	}
	@RequestMapping("/modificar")
	public String modificar(@ModelAttribute  TratamientoFincaVO tratamientofinca, Model modelo) {
		tfs.save(tratamientofinca);
	    modelo.addAttribute("fincas", fs.findAll());
	    modelo.addAttribute("tratamientos", ts.findAll());
	    return "redirect:/tratamientofincas/mostrar";
	}

	@RequestMapping("/eliminar")
	public String formeliminar(int idtratamientofinca, Model modelo) {
		tfs.delete(tfs.findById(idtratamientofinca).get());
	    modelo.addAttribute("tratamientofinca", tfs.findAll());
	    return "redirect:/tratamientofincas/mostrar";
	}

	
}