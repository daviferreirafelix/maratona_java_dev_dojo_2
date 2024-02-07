package com.Zgenerics.test;

import java.util.List;

abstract class Animal {
	public abstract void consulta();
}

class Cachorro extends Animal{
	@Override
	public void consulta() {
		System.out.println("Consultando dog");;
	}
	
}

class Gato extends Animal{
	@Override
	public void consulta() {
		System.out.println("Consultando gato");
	}
}

public class WildcardTest01 {
	public static void main(String[] args) {
		
		List<Animal> animais = List.of(new Cachorro(), new Gato());
		mostrarConsulta(animais);
	}
	
	public static void mostrarConsulta(List<Animal> animals) {
		for (Animal a: animals) {
			a.consulta();
		}
	}

}
