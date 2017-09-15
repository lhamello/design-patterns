package lham.projects.designpatterns.strategy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

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

		assertThat("Atacando pelo lado direito.", is(equalTo(time.atacar())));
	}
}
