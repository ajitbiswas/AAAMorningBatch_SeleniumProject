package scripts;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest {
	@Test
	public void testValidLogin(){
		
		LoginPage l = new LoginPage(driver);
		//enter username
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		l.setUsername(username);
		//enter password
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		l.setPassword(password);
		//click on Login button
		l.clickLogin();
		Assert.fail();
		
	}
}
