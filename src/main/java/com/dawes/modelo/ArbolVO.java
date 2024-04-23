package com.dawes.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "arboles")


public class ArbolVO {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idarbol;
	private int fila;
	private int columna;
	
	//fk idfinca
	@ManyToOne
	@JoinColumn(name = "idfinca")
	private FincaVO finca;
	@ManyToOne
	@JoinColumn(name = "idvariedad")
	private VariedadVO variedad;
	

	@OneToMany(mappedBy="arbol")
	private List<ReposicionVO> reposiciones;
	@OneToMany(mappedBy="arbol")
	private List<FotografiaVO> fotografias;
	 @OneToMany(mappedBy = "arbol")
	 private List<ArbolTratamientoVO> arboltratamientos;

	
}
