package com.dawes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.FincaVO;
import com.dawes.modelo.TratamientoVO;
import com.dawes.modelo.VariedadVO;
import com.dawes.servicio.TratamientoServicio;


@Controller
@RequestMapping("/tratamientos")
public class tratamientoController {


	@Autowired
	TratamientoServicio ts;
	 
	@RequestMapping("/mostrar")
	public String mostrar(Model model, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int pageSize) {
	    List<TratamientoVO> allTratamientos = (List<TratamientoVO>) ts.findAll();
	    
	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) allTratamientos.size() / pageSize);

		model.addAttribute("tratamientos", ts.findAll());
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("pageSize", pageSize);
	    model.addAttribute("totalPages", totalPages); // Add totalPages to the model

	    return "tratamiento/mostrar";
	}
	
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("tratamiento", new TratamientoVO());
		return "tratamiento/forminsertar";
	}
	@RequestMapping("/insertar")
	public String forminsertar(@ModelAttribute TratamientoVO tratamiento, Model modelo) {
		ts.save(tratamiento);
		modelo.addAttribute("tratamientos", ts.findAll());
		return  "redirect:/tratamientos/mostrar";
	}
	@RequestMapping("/formmodificar")
	public String formmodificar(@RequestParam int idtratamiento, Model modelo) {
		modelo.addAttribute("tratamiento", ts.findById(idtratamiento).get());
		return  "tratamiento/formmodificar";
	}
	@RequestMapping("/modificar")
	public String modificar(@ModelAttribute TratamientoVO tratamiento, Model modelo) {
	    // Logic to update the finca entity
	    ts.save(tratamiento);
	    modelo.addAttribute("tratamientos", ts.findAll());
	    return "redirect:/tratamientos/mostrar";
	}
	@RequestMapping("/eliminar")
	public String formeliminar(@RequestParam int idtratamiento, Model modelo) {
		ts.delete(ts.findById(idtratamiento).get());
		modelo.addAttribute("tratamientos", ts.findAll());
		return  "redirect:/tratamientos/mostrar";
	}
	
}
