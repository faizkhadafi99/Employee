package com.adl.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.adl.emp.model.EmpWorkerModel;
import com.adl.emp.repository.EmpWorkerRepository;

@RestController
public class EmpWorkerController {

@Autowired
private EmpWorkerRepository empWorkerRepo ;


@GetMapping("/worker")
public List <EmpWorkerModel> getAllWorker(){
	List<EmpWorkerModel> lstWorker = empWorkerRepo.findAll();
	return (lstWorker);
}


//@DeleteMapping ("/worker/{worker_ref_id}")
//public String deleteById(@PathVariable int worker_ref_id) {
//	return empWorkerRepo.deleteById(worker_ref_id) + "delete succesfull";
}


//@PostMapping("/worker")

//@PutMapping("/worker/{}")
//}

