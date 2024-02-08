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
		
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());
		List<Animal> a = List.of(new Gato(), new Cachorro());
		
		
		// exemplo do método com wildcard super
		mostrarConsultaAnimal(a);
		
		// exemplos de métodos com wildcard extends
		mostrarConsulta(gatos);
		mostrarConsulta(cachorros);
	}
											// já o wildcard extends define que o tipo genérico só
											// aceitará classes que estendem de Animals como parametro
	public static void mostrarConsulta(List<? extends Animal> animals) {
		for (Animal a: animals) {
			a.consulta();
		}
	}
												 // o wildcard super define que o tipo generico 
												 // aceitará apenas classes superiores a Animal
												 // como parametro
	public static void mostrarConsultaAnimal(List<? super Animal> animals) {
		for (Object o: animals) {
			System.out.println(o);
		}
		
	}
}
