package Configuration;

import org.testng.annotations.Test;

import PageObjects.Components;

public class Cam extends BaseClass {
	@Test
	public void startConfiguring() throws InterruptedException
	{
		Components components = new Components(driver);
//Login to Application
		Thread.sleep(5000);
		components.login(username, password);
		Thread.sleep(2000);
		
//Close modify password tips popup
		components.exitFromTipsPopup();
		Thread.sleep(10000);

//To click on configuration button
		components.configuration();
		Thread.sleep(2000);
	}
}