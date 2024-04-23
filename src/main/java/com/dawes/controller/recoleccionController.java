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
import com.dawes.modelo.TratamientoVO;
import com.dawes.servicio.FincaServicio;
import com.dawes.servicio.RecoleccionServicio;
import com.dawes.servicio.VariedadServicio;

@Controller
@RequestMapping("/recolecciones")
public class recoleccionController {

	
	@Autowired
	RecoleccionServicio rs;
	@Autowired
	FincaServicio fs;
	@Autowired
	VariedadServicio vs;
	@RequestMapping("/mostrar")
	public String mostrar(Model model, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int pageSize) {
	    List<RecoleccionVO> allRecolecciones = (List<RecoleccionVO>) rs.findAll();
	    
	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) allRecolecciones.size() / pageSize);

	    model.addAttribute("recolecciones", allRecolecciones);
	    model.addAttribute("fincas", fs.findAll());
	    model.addAttribute("variedades", vs.findAll());
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("pageSize", pageSize);
	    model.addAttribute("totalPages", totalPages); // Add totalPages to the model

	    return "recoleccion/mostrar";
	}

	
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("recoleccion", new RecoleccionVO());
		modelo.addAttribute("fincas", fs.findAll()); 
	    modelo.addAttribute("variedades", vs.findAll()); 
	        return "recoleccion/forminsertar";
	}
	@RequestMapping("/insertar")
	public String forminsertar(@ModelAttribute RecoleccionVO recoleccion, Model modelo) {
		rs.save(recoleccion);
		modelo.addAttribute("recolecciones", rs.findAll());
		return  "redirect:/recolecciones/mostrar";
	}
	@RequestMapping("/formmodificar")
	public String formmodificar(@RequestParam int idrecoleccion, Model modelo) {
		modelo.addAttribute("recoleccion", rs.findById(idrecoleccion).get());
		modelo.addAttribute("fincas", fs.findAll()); 
	    modelo.addAttribute("variedades", vs.findAll()); 
		return  "recoleccion/formmodificar";
	}
	@RequestMapping("/modificar")
	public String modificar(@ModelAttribute RecoleccionVO recoleccion, Model modelo) {
	    rs.save(recoleccion);
	    modelo.addAttribute("recolecciones", rs.findAll());
	    return "redirect:/recolecciones/mostrar";
	}

	@RequestMapping("/eliminar")
	public String formeliminar(int idrecoleccion, Model modelo) {
		rs.delete(rs.findById(idrecoleccion).get());
	    modelo.addAttribute("recolecciones", rs.findAll());
	    return "redirect:/recolecciones/mostrar";
	}

	
}
