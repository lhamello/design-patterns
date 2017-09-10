package lham.projects.designpatterns.strategy;

public class TimeFutebol {

	private EstrategiaOfensiva estrategiaOfensiva;

	public TimeFutebol(final EstrategiaOfensiva estrategiaOfensiva) {
		this.estrategiaOfensiva = estrategiaOfensiva;
	}

	public void alterarEstrategiaOfensiva(final EstrategiaOfensiva estrategiaOfensiva) {
		this.estrategiaOfensiva = estrategiaOfensiva;
	}

	public void atacar() {
		estrategiaOfensiva.executar();
	}
}
