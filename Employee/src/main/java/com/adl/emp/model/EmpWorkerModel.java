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
@Table (name = "worker")
public class EmpWorkerModel {
	
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int worker_id;


private String first_name;
private String last_name;
private int salary;
private LocalDateTime joining_date;
private String departement;

}
