package lham.projects.designpatterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class TimeFutebolTeste {

	@Test
	public void devePossuirEstrategiaOfensiva() {
		TimeFutebol time = new TimeFutebol(EstrategiaOfensiva.CHUVEIRINHO);
		Assert.assertNotNull(time.getEstrategiaOfensiva());
	}
}
