package lham.projects.designpatterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class TimeFutebolTeste {

	@Test
	public void devePossuirEstrategiaOfensiva() {
		TimeFutebol time = new TimeFutebol(EstrategiaOfensiva.CHUVEIRINHO);
		Assert.assertNotNull(time.getEstrategiaOfensiva());
	}
	
	@Test
	public void devePoderAlterarEstrategiaOfensiva() {
		TimeFutebol time = new TimeFutebol(EstrategiaOfensiva.CHUVEIRINHO);
		Assert.assertSame(EstrategiaOfensiva.CHUVEIRINHO, time.getEstrategiaOfensiva());
		
		time.alterarEstrategiaOfensiva(EstrategiaOfensiva.JOGAR_PELAS_LATERAIS);
		Assert.assertSame(EstrategiaOfensiva.JOGAR_PELAS_LATERAIS, time.getEstrategiaOfensiva());
	}
}
