package br.edu.ifba.inf011.aval1;
import java.util.LinkedHashMap;


import br.edu.ifba.inf011.aval1.BuilderExercicio.ExercicioBuilder;

public class TestAplicação {

	public static void main(String args[]) {
		
		FactoryEquipamento factory = new FactoryEquipamento();
		String identificadorEquipamento = "Identificador";
		String descricaoMaquina = "Maquina";
		String marca = "Marca";
		String descricaoAcessorio = "Acessorio";
		double pesoHalteres = 5.5;
		int quantidadeEquipamento = 5;

		factory.getEquipamento(identificadorEquipamento, quantidadeEquipamento, descricaoMaquina, marca,
				descricaoAcessorio, pesoHalteres);

		LinkedHashMap<String, String> Equipamento = new LinkedHashMap<String, String>();
		LinkedHashMap<String, Integer> EquipamentoInteger = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Double> EquipamentoDouble = new LinkedHashMap<String, Double>();

		/* Adiciona valores */
		Equipamento.put(identificadorEquipamento, "1DS");
		Equipamento.put(descricaoAcessorio, "Fita Strap, Elastico");
		Equipamento.put(descricaoMaquina, "Esteira");
		Equipamento.put(marca, "Firt");
		EquipamentoInteger.put("Quantidade", quantidadeEquipamento);
		EquipamentoDouble.put("Halteres", pesoHalteres);

		System.out.println("Equipamentos:\n " + Equipamento + EquipamentoInteger + EquipamentoDouble);

		/* Atualiza valores */
		Equipamento.put(identificadorEquipamento, "2DS");
		Equipamento.replace(descricaoAcessorio, "Anilha");
		Equipamento.replace(descricaoMaquina, "Bicicleta");
		Equipamento.replace(marca, "Board");
		EquipamentoInteger.put("Quantidade", quantidadeEquipamento + 1);
		EquipamentoDouble.put("Halteres", pesoHalteres + 1.5);

		System.out.println("Equipamentos Atualizados:\n " + Equipamento + EquipamentoInteger + EquipamentoDouble);

		ExercicioBuilder CronogramaTreino = new ExercicioBuilder()
				.Nome("Treino Pesado")
				.Tipos("Resistido")
				.grupoMuscular("Membro superior")
				.Equipamento("Esteira");
		System.out.print(CronogramaTreino);
	}
}