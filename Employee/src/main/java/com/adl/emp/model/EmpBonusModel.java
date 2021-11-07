package com.adl.emp.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name = "bonus")
public class EmpBonusModel {
		
		
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)

	private int worker_ref_id;


	private LocalDateTime bonus_date;
	private int bonus_amount;

	}
