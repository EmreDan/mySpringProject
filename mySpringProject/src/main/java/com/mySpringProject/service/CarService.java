package com.mySpringProject.service;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mySpringProject.domain.Car;

@Service
public class CarService {

	private List<Car> carList = new LinkedList<Car>();
	
	CarService() {
		Car car1 = new Car();
		car1.setName("Mercedes SL");
		car1.setPrice(new Double(123400));
		carList.add(car1);
 
		Car car2 = new Car();
		car2.setName("BMW M6 Coupé");
		car2.setPrice(new Double(125000));
		carList.add(car2);
 
		Car car3 = new Car();
		car3.setName("Audi R8");
		car3.setPrice(new Double(136100));
		carList.add(car3);
	}
 
	public List<Car> findAll() {
		return carList;
	}
	
}
