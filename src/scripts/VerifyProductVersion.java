package scripts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import generic.BaseTest;
import generic.Lib;
import pompages.EnterTimeTrackPage;
import pompages.LoginPage;
public class VerifyProductVersion extends BaseTest{
	@Test
	public void testProductVersion() throws InterruptedException{
		LoginPage l = new LoginPage(driver);
		//enter username
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		l.setUsername(username);
		//enter password
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		l.setPassword(password);
		//click on Login button
		l.clickLogin();
		Thread.sleep(5000);
		String eTitle = Lib.getCellValue("ProductVersion", 1, 0);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(eTitle));
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		//click on Help Menu
		e.clickHelpMenu();
		//Click on About YOur actitime
		e.clickAboutActiTimeLink();
		//Fetch the product version
		String expectedProductVersion = Lib.getCellValue("ProductVersion", 1, 1);
		String actualproductVersion = e.getProductVersion();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualproductVersion, expectedProductVersion);
		//close the product version window popup
		e.clickClosePopup();
		//click on log out
		e.clickLogout();
		s.assertAll();
	}

}
