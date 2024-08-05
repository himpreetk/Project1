import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {
       // 1. launch a browser
	   // 2. Close the browser
	
	public static void main(String[] args) {
		
      // 1. Launch the Browser
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//2. Open the URL
	driver.get("https://demoqa.com/automation-practice-form");
	
	   //3. Maximize the browser screen
	driver.manage().window().maximize();
	
	   //4. Add values to the text fields
	//4.1 Locating first name field using Xpath
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/input")).sendKeys("Magdalena");
	//4.2 Locating Last name using Id
	driver.findElement(By.id("lastName")).sendKeys("Kalok");
	//4.3 Locating Email field using CSS Selector
	driver.findElement(By.cssSelector("#userEmail")).sendKeys("magda@g.co");
	//4.4 Locating the gender option and selecting the radio button using Xpath
	WebElement radio1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/div[2]/label"));
	radio1.click();
	
	//4.5 Locating mobile number field using Id and adding number to it
    driver.findElement(By.id("userNumber")).sendKeys("1234567890");
	
	//4.6 Locating DOB field and selecting date from date picker using Id and CSS Selector
    driver.findElement(By.id("dateOfBirthInput")).click();
    driver.findElement(By.cssSelector(".react-datepicker__month-select")).sendKeys("July");
    driver.findElement(By.cssSelector(".react-datepicker__year-select")).sendKeys("1995");
    driver.findElement(By.cssSelector(".react-datepicker__day--015")).click();

	//4.6 Locating subject field using XPath and adding text to it
    driver.findElement(By.id("subjectsInput")).sendKeys("Computer Science");
    driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
    
	//4.7 Locating options for Hobbies and selecting one using XPath
    
    WebElement hobbiesCheckbox1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[1]/label"));
    if (!hobbiesCheckbox1.isSelected()) {
        hobbiesCheckbox1.click();
    }

    WebElement hobbiesCheckbox2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[2]/label"));
    if (!hobbiesCheckbox2.isSelected()) {
        hobbiesCheckbox2.click();
    }
	//4.8 Locating the attachment field and adding attachment to it using XPath
    WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
    uploadElement.sendKeys("C:\\Users\\raman\\OneDrive\\Desktop\\TESTC.png");
    
	//4.9 Locating Current address field using XPath and adding text to it
    driver.findElement(By.id("currentAddress")).sendKeys("1234 Elm Street, Springfield, IL");
    
	//4.10 Locating the options in State and City in the Drop-down And Selecting one using XPath
    driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
    driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi");
    driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
	
	//4.10 Locating submit button using XPath and click the button 
    driver.findElement(By.id("submit")).click();
      
       
      //5. Wait time
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  
	 //6. Close browser
	driver.quit();
	}

}
