package br.edu.ifba.inf011.aval1;

class BuilderExercicio  {
	
	     String Nome;
		 String Tipos;
		 String grupoMuscular;
		 String Equipamento;

		
		 public BuilderExercicio(String Nome, String Tipos, String grupoMuscular, String Equipamento) {

			this.Nome = Nome;
			this.Tipos = Tipos;
			this.grupoMuscular = grupoMuscular;
			this.Equipamento = Equipamento;
			
		}

		public static class ExercicioBuilder {

			private String Nome;
			private String Tipos;
			private String grupoMuscular;
			private String Equipamento;

			public ExercicioBuilder() {
			}

			@Override
			public String toString() {
				return "\nCronograma treino:\nNome = " + Nome
						+ "\nTipos = " + Tipos 
						+ "\nGrupo muscular = " + grupoMuscular
						+ "\nEquipamento = " + Equipamento ;
			}

			public ExercicioBuilder Nome(String nome) {
				this.Nome = nome;
				return this;
			}

			public ExercicioBuilder Tipos(String tipos) {
				this.Tipos = tipos;
				return this;
			}

			public ExercicioBuilder grupoMuscular(String grupoMuscular) {
				this.grupoMuscular = grupoMuscular;
				return this;
			}

			public ExercicioBuilder Equipamento(String equipamento) {
				this.Equipamento = equipamento;
				return this;
			}

			public BuilderExercicio CriarExercicio() {
				return new BuilderExercicio(Nome, Tipos, grupoMuscular, Equipamento);
			}

			public String getNome() {
				return Nome;
			}

			public void setNome(String nome) {
				this.Nome = nome;
			}

			public String getTipos() {
				return Tipos;
			}

			public void setTipos(String tipos) {
				this.Tipos = tipos;
			}

			public String getGrupoMuscular() {
				return grupoMuscular;
			}

			public void setGrupoMuscular(String grupoMuscular) {
				this.grupoMuscular = grupoMuscular;
			}

			public String getEquipamento() {
				return Equipamento;
			}

			public void setEquipamento(String equipamento) {
				this.Equipamento = equipamento;
			}

		}

	
	}