package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RecetaTest {

	@Test
	public void testIsGlutenFree() {

		Ingrediente[] ingredientes = { new Ingrediente(500, "bonito", true), new Ingrediente(25, "pan de sopa", true) };

		// caso1 todos los ingrdientes gluten

		Receta r = new Receta("", ingredientes);

		assertFalse(" caso1 todos los ingredientes con gluten", r.isGlutenFree());

		// caso2 todos los ingredientes SIN gluten
		ingredientes[0] = new Ingrediente(500, "bonito", false);
		ingredientes[1] = new Ingrediente(25, "pan de sopa", false);

		r = new Receta("", ingredientes);
		assertTrue(" caso 2 todos los ingredientes SIN gluten", r.isGlutenFree());

		// caso3 todos los ingredientes con y sin gluten

		ingredientes[0] = new Ingrediente(500, "bonito", true);
		ingredientes[1] = new Ingrediente(25, "pan de sopa", false);

		r = new Receta("", ingredientes);
		assertFalse(" caso 3 todos los ingredientes con y sin gluten", r.isGlutenFree());

		// caso null

		r = new Receta("", null);
		assertTrue(" caso 4 sin ingredientes", r.isGlutenFree());
	}

}
