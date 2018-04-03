package pompages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class EnterTimeTrackPage {
	@FindBy(xpath="//div[contains(text(),'Help')]")
	WebElement helpMenu;
	@FindBy(linkText="About your actiTIME")
	WebElement AboutActiTimelink;
	@FindBy(xpath="(//span[contains(text(),'actiTIME')])[1]")
	WebElement productVersion;
	@FindBy(id="aboutPopupCloseButtonId")
	WebElement closePopupWindow;
	@FindBy(id="logoutLink")
	WebElement logoutBtn;
	public EnterTimeTrackPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickHelpMenu(){
		helpMenu.click();
	}
	public void clickAboutActiTimeLink(){
		AboutActiTimelink.click();
	}
	public String getProductVersion(){
		return productVersion.getText();
	}
	public void clickClosePopup(){
		closePopupWindow.click();
	}
	public void clickLogout(){
		logoutBtn.click();
	}
}
