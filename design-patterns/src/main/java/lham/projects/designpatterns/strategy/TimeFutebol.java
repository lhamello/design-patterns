package lham.projects.designpatterns.strategy;

public class TimeFutebol {

	private EstrategiaOfensiva estrategiaOfensiva;

	public TimeFutebol(final EstrategiaOfensiva estrategiaOfensiva) {
		this.estrategiaOfensiva = estrategiaOfensiva;
	}

	public EstrategiaOfensiva getEstrategiaOfensiva() {
		return estrategiaOfensiva;
	}

	public void alterarEstrategiaOfensiva(EstrategiaOfensiva novaEstrategiaOfensiva) {
		this.estrategiaOfensiva = novaEstrategiaOfensiva;
	}

	public String atacar() {
		switch (estrategiaOfensiva) {
		case CHUVEIRINHO:
			return "Jogando a bola na área sempre que possível.";
		case JOGAR_PELAS_LATERAIS:
			return "Atavando pelos dois lados.";
		case JOGAR_PELO_LADO_DIREITO:
			return "Atacando pelo lado direito.";
		case JOGAR_PELO_LADO_ESQUERDO:
			return "Atacando pelo lado esquerdo.";
		case JOGAR_PELO_MEIO:
			return "Jogando pelo meio.";
		default:
			throw new RuntimeException("Este time não possui estratégia ofensiva definida.");
		}
	}
}
