package lham.projects.designpatterns.strategy;

public class Jogo {

	public static void main(String[] args) {
		EstrategiaOfensiva estrategia = new EstrategiaJogarPelasLaterais();
		TimeFutebol gremio = new TimeFutebol(estrategia);
		gremio.atacar();
		
		gremio.alterarEstrategiaOfensiva(new EstrategiaJogarPeloMeio());
		gremio.atacar();
		
		gremio.alterarEstrategiaOfensiva(new EstrategiaJogarPeloLadoDireito());
		gremio.atacar();
		
		gremio.alterarEstrategiaOfensiva(new EstrategiaJogarPeloLadoEsquerdo());
		gremio.atacar();
		
		gremio.alterarEstrategiaOfensiva(new EstrategiaChuveirinho());
		gremio.atacar();
	}
}
