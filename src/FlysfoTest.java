
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.junit.*;



public class FlysfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// open the firefox search engine
	 	WebDriver driver = new FirefoxDriver();
	 	
	 	// maximize the firefox window
	 	driver.manage().window().maximize();
	 	
	 	// open the flysfo career website
	 	driver.get("http://flysfo.com/jobs");
	 	
	 	// finding the SFO logo
	 	WebElement sfoLogo = driver.findElement(By.id("logo"));
	 	Assert.assertNotNull("logo is not found", sfoLogo);
	 	
	 	// finding the first top menu 'flight info'
	 	WebElement navBox = driver.findElement(By.id("nav"));
	 	WebElement flightInfo = navBox.findElement(By.linkText("Flight Info"));
	 	
	 	Assert.assertNotNull("Flight Info is not found", flightInfo);
	 	
	 	//hover on the menu
	 	Actions action = new Actions(driver);
	 	action.moveToElement(flightInfo).perform();
	 	
	 	//delay for a few seconds
	 	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	 	
	 	// checking the color of 'flight info'
	 	Assert.assertEquals("rgba(0, 92, 124, 1)", flightInfo.getCssValue("color"));
	 	
	 	
	 	//find the element "Flight Status" sub-menu
	 	WebElement flightStatusSubmenu = driver.findElement(By.xpath("//nav[@id='nav']/ul/li[1]/ul/li[1]/a"));
	 	action.moveToElement(flightStatusSubmenu).perform();
	 	
	 	
	 	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
	 	//click the "Flight Status sub-menu
	 	flightStatusSubmenu.click();
	 	
	 	// find the "Departure" and "Arrival" switch button and click
	 	//WebElement depArriButton = flightStatusSubmenu.findElement(By.xpath("//div[@id='search_grid']/ul/li[1]/a"));
	 	//action.moveToElement(depArriButton).perform();
	 	//depArriButton.click();
	 	
	 	WebElement searchGrid = driver.findElement(By.id("search_grid"));
	 	WebElement rgl = searchGrid.findElement(By.id("rgl"));
	 	WebElement rl = rgl.findElement(By.id("rl"));
	 	Assert.assertNotNull("******** NOT FOUND **********", rl);
	 	
	 	
	 	// close the web page
	 	driver.close();
	 	
	 	//Testing 1
	 	
	}

}
