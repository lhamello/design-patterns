package lham.projects.designpatterns.strategy;

import org.junit.Assert;
import org.junit.Test;

import lham.projects.designpatterns.strategy.EstrategiaOfensiva;
import lham.projects.designpatterns.strategy.TimeFutebol;

public class TimeFutebolTest {

	@Test
	public void devePossuirEstrategiaOfensiva() {
		TimeFutebol time = new TimeFutebol(EstrategiaOfensiva.JOGAR_PELO_MEIO);
		Assert.assertNotNull(time.getEstrategiaOfensiva());
	}

	@Test
	public void devePoderAlterarEstrategiaOfensiva() {
		TimeFutebol time = new TimeFutebol(EstrategiaOfensiva.CHUVEIRINHO);
		Assert.assertSame(EstrategiaOfensiva.CHUVEIRINHO, time.getEstrategiaOfensiva());

		time.alterarEstrategiaOfensiva(EstrategiaOfensiva.JOGAR_PELAS_LATERAIS);
		Assert.assertSame(EstrategiaOfensiva.JOGAR_PELAS_LATERAIS, time.getEstrategiaOfensiva());
	}

	@Test
	public void devePoderAtacarUtilizandoEstrategiaOfensivaAtual() {
		TimeFutebol time = new TimeFutebol(EstrategiaOfensiva.JOGAR_PELO_LADO_DIREITO);

		Assert.assertEquals("Atacando pelo lado direito.", time.atacar());
	}
}
