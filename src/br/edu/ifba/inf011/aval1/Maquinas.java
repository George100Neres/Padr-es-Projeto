package br.edu.ifba.inf011.aval1;

public class Maquinas extends Equipamento {

	public Maquinas(String descricaoMaquina, String marca) {
		this.descricaoMaquina = descricaoMaquina;
		this.marca = marca;

		System.out.println("Descrição da maquina" + this.descricaoMaquina);
		System.out.println("Marca" + this.marca);

	}
}