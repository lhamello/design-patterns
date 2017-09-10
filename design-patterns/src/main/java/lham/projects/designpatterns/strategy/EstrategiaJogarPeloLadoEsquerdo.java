package lham.projects.designpatterns.strategy;

public class EstrategiaJogarPeloLadoEsquerdo implements EstrategiaOfensiva {

	public void executar() {
		System.out.println("Explorando o lado esquerdo do ataque.");
	}
}
