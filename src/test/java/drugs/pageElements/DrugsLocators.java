package drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsLocators {

	@FindBy(xpath="//a[normalize-space()='Side Effects Checker']")
	public WebElement SideEfChck;
	
	@FindBy(xpath="//input[@id='livesearch-sfx']")
	public WebElement searchbox;
	
	@FindBy(xpath="//button[@class='ddc-btn']//*[@class='ddc-icon ddc-icon-search']")
	public WebElement srchhbtn;
	////////////////////////////////////////
	@FindBy(xpath="//a[normalize-space()='Register']")
	public WebElement registerbtn;
	
	@FindBy(xpath="//input[@id='user-email']")
	public WebElement emailbox;
	
	@FindBy(xpath="//input[@value='Continue with email']")
	public WebElement continuebtn;
	////////////////////////////////
	@FindBy(xpath="//nav[@class='ddc-header-nav-home']//a[normalize-space()='Interactions Checker']")
	public WebElement Intcheck;
	
	@FindBy(xpath="//input[@id='livesearch-interaction-basic']")
	public WebElement Srchbox;
	
	@FindBy(xpath="//input[@value='Add']")
	public WebElement add ;
	
	@FindBy(xpath="//a[normalize-space()='Check Interactions']")
	public WebElement intchkbtn;
	////////////////////////////////////////////
	@FindBy(xpath="//a[normalize-space()='Sign In']")
	public WebElement signin;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement pwbox;
	
	@FindBy(xpath="//input[@value='Sign In']")
	public WebElement SignIn;
	///////////////////////////////
	@FindBy(xpath="//a[normalize-space()='Browse Conditions']")
	public WebElement BrCon ;
	
	@FindBy(xpath="//a[@aria-label='Browse conditions and diseases by letter: k']")
	public WebElement letterK;
	
	@FindBy(xpath="//a[normalize-space()='Knee Pain']")
	public WebElement Kneepain;
	///////////////////////////////////////
	@FindBy(xpath="//input[@id='livesearch-main']")
	public WebElement srchbx;
	
	@FindBy(xpath="//button[@class='ddc-btn']//*[@class='ddc-icon ddc-icon-search']")
	public WebElement srchbtn;
	
	@FindBy(xpath="//a[@href='https://www.drugs.com/entyvio.html']//h3[@class='ddc-media-title']//b[contains(text(),'Entyvio')]")
	public WebElement entyvio;
	///////////////////////////////////
	@FindBy(xpath="//a[normalize-space()='Help center']")
	public WebElement helpcenter;
	
	@FindBy(xpath="//a[normalize-space()='Poison Control Center']")
	public WebElement poisoncentr;
	
	@FindBy(xpath="//nav[@class='ddc-header-nav-home']//ul//li//a[@href='/sitemap.html']")
	public WebElement More;
	
	@FindBy(xpath="//a[normalize-space()='Drug comparison tool']")
	public WebElement CompTool;
	
	@FindBy(xpath="//a[@href='/compare/aimovig-vs-botox']")
	public WebElement AimovsBoto;
	///////////////////////////////////////////
	@FindBy(xpath="//nav[@class='ddc-header-nav-home']//ul//li//a[@href='/sitemap.html']")
	public WebElement MoreTab;
	
	@FindBy(xpath="//a[normalize-space()='Drug half life calculator']")
	public WebElement DhalfLife;
	
	@FindBy(xpath="//input[@type='number']")
	public WebElement halflifebx;
	
	@FindBy(xpath="//a[normalize-space()='Calculate']")
	public WebElement Calculate;
	//////////////////////////////////////////
	@FindBy(xpath="//*[@class='ddc-icon ddc-icon-next']")
	public WebElement Nxt;
	
	@FindBy(xpath="//img[@src='img/home/conditions-diseases.png']")
	public WebElement ConDes;
	
	@FindBy(xpath="//ul[@class='ddc-list-column-4']//a[normalize-space()='Hair Loss']")
	public WebElement HairLoss;
	
	}
