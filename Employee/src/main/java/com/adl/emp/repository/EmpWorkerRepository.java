package com.adl.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adl.emp.model.EmpWorkerModel;

public interface EmpWorkerRepository extends JpaRepository <EmpWorkerModel, Integer> {


}
