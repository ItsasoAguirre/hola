package com.ipartek.formacion.hola.pojo;

import java.util.Arrays;

public class Receta {

	// Atributos
	private String titulo;
	private Ingrediente[] ingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;

	// CONSTRUCTORES

	public Receta(String titulo, Ingrediente[] ingredientes, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = titulo;
		this.ingredientes = ingredientes;
		this.tiempo = tiempo;
		this.dificultad = dificultad;
		this.comensales = comensales;
		this.descripcion = descripcion;
	}

	public Receta(String titulo, Ingrediente[] ingredientes) {
		super();
		this.titulo = titulo;
		this.ingredientes = ingredientes;
		this.dificultad = "facil";
		this.descripcion = "Lorem ipsum...";
		this.comensales = 0;
		this.tiempo = 0;
	}

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", ingredientes=" + Arrays.toString(ingredientes) + ", tiempo=" + tiempo
				+ ", dificultad=" + dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion + "]";
	}

	// GETTERS AND SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// METODOS
	// TODO resalizar test para gluten

	/**
	 * Nos indica si la receta esta libre de ingredientes con gluten
	 * 
	 * @return true si todos los ingredientes no contienen gluten<br>
	 *         false si alguno de los ingredientes contiene gluten<br>
	 *         true si no existen ingredientes
	 */
	public boolean isGlutenFree() {
		boolean resultado = true;
		// Comprobar primero si es nulo
		if (this.ingredientes != null) {
			for (Ingrediente i : this.ingredientes) {
				if (i.isGluten()) {
					resultado = false;
					// como encontramos un ingrediente con gluten no hace falta
					// mas y salimos con el break
					break;
				}
			}
		}

		return resultado;
	}

	public void addIngrediente(Ingrediente ingrediente) {

	}

	/**
	 * Elimina el primer ingrediente que encuentre con el mismo
	 * <code>nombre</code> CaseInsensitive
	 * 
	 * @param ingrediente
	 *            ingrediente a eliminar
	 * @return true si elimina ingrediente<br>
	 *         false caso contrario
	 */
	public boolean removeIngrediente() {
		return false;
	}

}