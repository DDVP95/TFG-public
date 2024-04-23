package com.dawes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.ArbolVO;
import com.dawes.modelo.FincaVO;
import com.dawes.modelo.VariedadTratamientoFincaVO;
import com.dawes.servicio.ArbolServicio;
import com.dawes.servicio.FincaServicio;

@Controller
@RequestMapping("/fincas")
public class fincaController {

	
	@Autowired
	FincaServicio fs;
	@Autowired
	ArbolServicio as;

	@RequestMapping("/mostrar")
	public String mostrarFincas(Model model, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int pageSize) {
	    List<FincaVO> allFincas = (List<FincaVO>) fs.findAll();
	    
	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) allFincas.size() / pageSize);

		model.addAttribute("fincas", fs.findAll());
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("pageSize", pageSize);
	    model.addAttribute("totalPages", totalPages); // Add totalPages to the model

	    return "finca/mostrar";
	}
	@RequestMapping("/forminsertar")
	public String forminsertar(Model modelo) {
		modelo.addAttribute("finca", new FincaVO());
		return  "finca/forminsertar";
	}
	@RequestMapping("/insertar")
	public String forminsertar(@ModelAttribute FincaVO finca, Model modelo) {
		fs.save(finca);
		modelo.addAttribute("fincas", fs.findAll());
		return  "redirect:/fincas/mostrar";
	}
	@RequestMapping("/formmodificar")
	public String formmodificar(@RequestParam int idfinca, Model modelo) {
		modelo.addAttribute("finca", fs.findById(idfinca).get());
		return  "finca/formmodificar";
	}
	@RequestMapping("/modificar")
	public String modificar(@ModelAttribute FincaVO finca, Model modelo) {
	    // Logic to update the finca entity
	    fs.save(finca);
	    modelo.addAttribute("fincas", fs.findAll());
	    return "redirect:/fincas/mostrar";
	}
	@RequestMapping("/eliminar")
	public String formeliminar(@RequestParam int idfinca, Model modelo) {
		fs.delete(fs.findById(idfinca).get());
		modelo.addAttribute("fincas", fs.findAll());
		return  "redirect:/fincas/mostrar";
	}
	
	@RequestMapping("/variedadtratamientofinca")
	public String listadovariedadtratamientofincas(Model modelo, @RequestParam int idfinca) {
		FincaVO finca=fs.findById(idfinca).get();
		List<VariedadTratamientoFincaVO> variedadtratamientofincas = finca.getVariedadtratamientofincas();
		modelo.addAttribute("finca", finca);
		modelo.addAttribute("variedadtratamientofincas", variedadtratamientofincas);
		return "finca/variedadtratamientofinca";
	}
	@RequestMapping("/map/{idfinca}")
	public String showFincaMap(
	    @PathVariable int idfinca,
	    @RequestParam(name = "currentPage", defaultValue = "1") int currentPage,
	    Model model
	) {
	    // Number of items per page
	    int itemsPerPage = 10;

	    // Logic to retrieve arboles for the finca with the given id
	    FincaVO finca = fs.findById(idfinca).orElseThrow();
	    List<ArbolVO> arboles = as.findByFinca(finca);

	    // Calculate the total number of pages
	    int totalPages = (int) Math.ceil((double) arboles.size() / itemsPerPage);

	    // Calculate the start and end indices for the current page
	    int startIndex = (currentPage - 1) * itemsPerPage;
	    int endIndex = Math.min(startIndex + itemsPerPage, arboles.size());

	    // Get the sublist for the current page
	    List<ArbolVO> arbolesForPage = arboles.subList(startIndex, endIndex);

	    model.addAttribute("finca", finca);
	    model.addAttribute("arbolesForPage", arbolesForPage); // Pass arbolesForPage to the model
	    model.addAttribute("currentPage", currentPage);
	    model.addAttribute("totalPages", totalPages);

	    return "finca/map";
	}






}