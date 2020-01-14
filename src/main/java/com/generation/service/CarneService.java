package com.generation.service;

import java.util.ArrayList;
import java.util.List;

import com.generation.model.Carne;

public class CarneService {
	
	List<Carne> carnes = new ArrayList<Carne>();

		
	public CarneService() {
		
	}
	public CarneService(List<Carne> carnes) {
		super();
		this.carnes = carnes;
	}

	public List<Carne> getCarnes() {
		return carnes;
	}
	
	public void addLista(Carne carne) {
		
		carnes.add(carne);
	}
	
	public void deleteLista(Carne carne) {
		carnes.remove(carne);
	}
	
	public void getAllLista() {
		for (Carne x : carnes) {
			System.out.println(x);
		}
	}
	@Override
	public String toString() {
		return "CarneService [carnes=" + carnes + "]";
	}
	
	

}
