package com.dawes.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "recolecciones")

public class RecoleccionVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idrecoleccion;
	private LocalDate fecha;
	
	@ManyToOne
	@JoinColumn(name = "idvariedad")
	private VariedadVO variedad;
	
	@ManyToOne
	@JoinColumn(name = "idfinca")
	private FincaVO finca;
}
