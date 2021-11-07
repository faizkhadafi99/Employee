package com.adl.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adl.emp.model.EmpBonusModel;
import com.adl.emp.repository.EmpBonusRepository;


@RestController
public class EmpBonusController {

@Autowired
private EmpBonusRepository empBonusRepo ;


@GetMapping("/bonus")
public List <EmpBonusModel> getAllBonus(){
	List<EmpBonusModel> lstBonus = empBonusRepo.findAll();
	return (lstBonus);
}

}
