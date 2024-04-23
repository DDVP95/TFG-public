package com.dawes.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
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
@Table(name= "arboltratamientos")

public class ArbolTratamientoVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idarboltratamiento;
	private LocalDate fecha;
	@ManyToOne
	@JoinColumn(name = "idarbol")
	private ArbolVO arbol;
	
	@ManyToOne
	@JoinColumn(name = "idtratamiento")
	private TratamientoVO tratamiento;

	
}
