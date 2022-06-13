package br.edu.ifba.inf011.aval1;

public class SubEquipamento extends Equipamento {

	public SubEquipamento(String identificadorEquipamento, int quantidadeEquipamento) {
		this.identificadorEquipamento = identificadorEquipamento;
		this.quantidadeEquipamento = quantidadeEquipamento;

		System.out.println("Identificador" + this.identificadorEquipamento);
		System.out.println("Quantidade" + this.quantidadeEquipamento);

	}

}