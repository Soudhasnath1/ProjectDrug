package drugs.pageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import drugs.pageElements.DrugsLocators;
import drugs.utilities.SetupDrivers;

public class DrugsAction {
 DrugsLocators DrugsLocatorsobj;
 
 public DrugsAction(){
	 DrugsLocatorsobj = new DrugsLocators();
	 PageFactory.initElements(SetupDrivers.driver,DrugsLocatorsobj);
 }
 
 public void SideEfChck(){
	 DrugsLocatorsobj.SideEfChck.isDisplayed();
	 DrugsLocatorsobj.SideEfChck.click();
 }
 public void Searchbox() throws Exception{
	 DrugsLocatorsobj.searchbox.sendKeys("tolterodine");
	 DrugsLocatorsobj.srchhbtn.isEnabled();
	Thread.sleep(2000);
 }
 public void SearchboxClick(){
	 DrugsLocatorsobj.srchhbtn.click();
 }/////////////////////////////////////////
 public void register(){
	 DrugsLocatorsobj.registerbtn.click();
 }
 public void Email(){
	 DrugsLocatorsobj.emailbox.sendKeys("fahim@gmail.com");
	 DrugsLocatorsobj.emailbox.click();
 }
 public void ConEmail(){
	 DrugsLocatorsobj.continuebtn.click();
 }
 //////////////////////////////////////////////////
 public void IntCheck(){
	 DrugsLocatorsobj.Intcheck.click();
 }
 public void searchbx(){
	 DrugsLocatorsobj.Srchbox.sendKeys("Tylenol");
	
 }
 public void Add(){
	 DrugsLocatorsobj.add.click();
 }
 public void Intchk(){
	 DrugsLocatorsobj.intchkbtn.click();
 }///////////////////////////////////
 public void signin() throws Exception{
	 DrugsLocatorsobj.signin.click();
	 Thread.sleep(2000);
}
 public void username(){
	 DrugsLocatorsobj.username.sendKeys("soudhasnath120@gmail.com");
	 DrugsLocatorsobj.username.click(); 
 }
 public void PW(){
	 DrugsLocatorsobj.pwbox.sendKeys("Fahim@1998");
	 DrugsLocatorsobj.pwbox.click();
 }
 public void SignIn(){
	 DrugsLocatorsobj.SignIn.click();
 }//////////////////////////////////////////////
 public void BrowseCOn(){
	 DrugsLocatorsobj.BrCon.click();
 }
 public void LetterK() throws Exception{
	 DrugsLocatorsobj.letterK.click();
	 Thread.sleep(2000);
 }
 public void KneePain(){
	 DrugsLocatorsobj.Kneepain.click();
 }
 public void Searchbx(){
	 DrugsLocatorsobj.srchbx.sendKeys("Entyvio");
 }
 public void searchbtn(){
	 DrugsLocatorsobj.srchbtn.click();
 }
 public void Entyvio(){
	 DrugsLocatorsobj.entyvio.click();
 }
 public void HelpCntr(){
	 DrugsLocatorsobj.helpcenter.click();
 }
 public void PoisnCntr(){
	 DrugsLocatorsobj.poisoncentr.click();
 }//////////////////////////////////////////
 public void More(){
	 DrugsLocatorsobj.More.click();
 }
 public void ComTool(){
	 DrugsLocatorsobj.CompTool.click();
 }
 public void AimBoto(){
	 DrugsLocatorsobj.AimovsBoto.click();
 }///////////////////////////////////////
 public void MoreTab(){
	 DrugsLocatorsobj.MoreTab.click();
 }
 public void DhalfLife(){
	 DrugsLocatorsobj.DhalfLife.click();
 }
 public void HalfLifeBx(){
	 DrugsLocatorsobj.halflifebx.sendKeys("2");
	 
 }
 public void Calculate(){
	 DrugsLocatorsobj.Calculate.click();
 }////////////////////////////////////////////
 public void Next() throws Exception{
	 DrugsLocatorsobj.Nxt.click(); 
	 Thread.sleep(2000);
 }
 public void ConDeases(){
	 DrugsLocatorsobj.ConDes.click();
 }
 public void HairLoss(){
	 DrugsLocatorsobj.HairLoss.click();
 }
}
 
