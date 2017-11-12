package com.mySpringProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mySpringProject.domain.Car;
import com.mySpringProject.service.CarService;

@Controller
public class CarController {

	@Autowired
	private CarService myCarService;
	
	@RequestMapping("/car/list")
	public void getCarList(Model model) {
		List<Car> myCars = myCarService.findAll();
		model.addAttribute("cars",myCars);
	}
	
	
}
