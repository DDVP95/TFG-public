package com.dawes.modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "fincas")


public class FincaVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idfinca;
	private String nombre;
	
	
	
	@OneToMany(mappedBy="finca")
	private List<ArbolVO> arboles;
	
	@OneToMany(mappedBy="finca")
	private List<RecoleccionVO> recolecciones;
	
	@OneToMany(mappedBy="finca")
	private List<VariedadVO> variedades;
	
	@OneToMany(mappedBy="finca")
	private List<VariedadTratamientoFincaVO> variedadtratamientofincas;
	
	@OneToMany(mappedBy="finca")
	private List<TratamientoFincaVO> tratamientosfincas;
}
