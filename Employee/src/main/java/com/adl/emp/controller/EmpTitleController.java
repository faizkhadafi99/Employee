package com.adl.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adl.emp.model.EmpTitleModel;
import com.adl.emp.repository.EmpTitleRepository;



@RestController
public class EmpTitleController {

@Autowired
private EmpTitleRepository empTitleRepo ;


@GetMapping("/title")
public List <EmpTitleModel> getAllTitle (){
	List<EmpTitleModel> lstTitle = empTitleRepo.findAll();
	return (lstTitle);
}

}
