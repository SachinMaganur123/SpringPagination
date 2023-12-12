package com.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.bean.Employee;
import com.mvc.dao.EmpDao;

@Controller
public class EmployeeController {
	
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/show")
	public String show() {
		return "index";
	}
	
	@RequestMapping(value="/vieemp/{pageid}")
	public String view(@PathVariable int pageid ,Model m) {
		
		int total=5;
		if(pageid==1) {}
		else {
			pageid=(pageid-1)*total+1;    
		}
		System.out.println(pageid);
		List<Employee> list=dao.getAllEmployee(pageid, total);
		m.addAttribute("list" ,list);
		return "vieemp";
		
	}

}
