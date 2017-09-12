package lham.projects.designpatterns.strategy;

public class TimeFutebol {

	private EstrategiaOfensiva estrategiaOfensiva;

	public TimeFutebol(final EstrategiaOfensiva estrategiaOfensiva) {
		this.estrategiaOfensiva = estrategiaOfensiva;
	}

	public EstrategiaOfensiva getEstrategiaOfensiva() {
		return estrategiaOfensiva;
	}
}
