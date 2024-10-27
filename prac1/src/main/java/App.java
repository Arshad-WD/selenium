//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class App {
//
//	public static void main(String args[])
//	{
//	
//		// Instantiate a ChromeDriver class.
//		WebDriver driver = new ChromeDriver();
//
//		// Maximize the browser
//		driver.manage().window().maximize();
//
//		// Launch Website
//		driver.get("https://www.geeksforgeeks.org/");
//	}
//}



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class App{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		 WebElement searchBar = driver.findElement(By.name("search_query"));

	        // Enter a search term into the search bar
	        searchBar.sendKeys("Selenium WebDriver tutorial");

	        // Locate and click the search button
	        WebElement searchButton = driver.findElement(By.id("Search"));
	        searchButton.click();
			
	}
}