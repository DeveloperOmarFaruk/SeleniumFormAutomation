package SeleniumFormAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFormAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
//		Browser window maximize command
		driver.manage().window().maximize();
		
//		Browser Get command
		driver.get("https://trytestingthis.netlify.app/");
		
//		Browser tab working time command
		Thread.sleep(3000);
		
//		Get the filed first name
		WebElement FirstName = driver.findElement(By.id("fname")); 
		
//		Get the filed last name
		WebElement LastName = driver.findElement(By.id("lname"));
		
//		Get the filed Gender
		WebElement GenderRadio = driver.findElement(By.id("male"));
		
//		Radio button is selected confirmation or check
		assert GenderRadio.isSelected();
		
		
//		Get the filed Option dropdownButton
		WebElement OptionDropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select(OptionDropdown);
		  
		
//		Get the filed Option checkboxButton
		WebElement CheckBox = driver.findElement(By.xpath("//input[@value='Option 1']"));
		
//      Find the date time picker control
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='day']"));
		
		
		
//		Get the filed File upload
		WebElement FileUpload = driver.findElement(By.xpath("//input[@id='myfile']"));
		
//		Get the filed TextareaInput
		WebElement Textarea = driver.findElement(By.name("message"));
		Textarea.clear();
		
		
//		Get the click submit button
		WebElement SubmitButton = driver.findElement(By.className("btn-success"));
		
		   
		
		
		
		FirstName.sendKeys("Omar");
		LastName.sendKeys("Faruk");
		GenderRadio.click();
		System.out.println(GenderRadio.isSelected());
//		Any chose one option
//		dropdown.selectByIndex(2);
//		dropdown.selectByValue("option 2");
		dropdown.selectByVisibleText("Option 2");
		CheckBox.click();
		dateBox.sendKeys("08242023");
		
		FileUpload.sendKeys("C:\\Users\\ToTuL'S PC\\Downloads\\catkin.png");
		Textarea.sendKeys("I am a student. I love Bangladesh. Bangladesh is a small country.");
		
//		Browser tab working time command
		Thread.sleep(3000);
		
		SubmitButton.click();
		
		
//		Browser tab working time command
		Thread.sleep(6000);
		
//		Browser tab close command
		driver.quit();

	}

}
