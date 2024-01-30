package steps;

import io.cucumber.java.After;
import utils.SeleniumDriver;

public class AfterActions {
	@After
	public static void tearDown() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SeleniumDriver.tearDown();

	}
}
