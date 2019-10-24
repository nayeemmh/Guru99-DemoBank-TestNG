import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTC {
	
	 public String baseUrl = "http://demo.guru99.com/v4/";
	 String driverPath = "E:\\Selenium\\geckodriver.exe";
	 public WebDriver driver;
	    
	    
  @Test
  public void Login() {
	  
	  System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      driver.manage().window().maximize();
      driver.findElement(By.name("uid")).sendKeys("mngr227124");
      driver.findElement(By.name("password")).sendKeys("amUvyhu");
      driver.findElement(By.name("btnLogin")).click();
      String expectedTitle = "Guru99 Bank Manager HomePage";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      WebElement mngrid = driver.findElement(By.xpath("//tr[@class='heading3']/td"));
      String actual_text = mngrid.getText();
      actual_text= actual_text.replace("Manger Id :"," ");
      System.out.println(actual_text);
      
  }
  
  @Test
  public void addCustomer() {
	  
	  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]")).click();
	  driver.findElement(By.name("name")).sendKeys("Test Customer");
      driver.findElement(By.name("rad1")).click();
      driver.findElement(By.name("addr")).sendKeys("Test Address");
      driver.findElement(By.name("city")).sendKeys("Dhaka");
      driver.findElement(By.name("state")).sendKeys("Dhaka");
      driver.findElement(By.name("pinno")).sendKeys("54321");
      driver.findElement(By.name("telephoneno")).sendKeys("01710000000");
      driver.findElement(By.name("emailid")).sendKeys("sample@email.com");
      driver.findElement(By.name("password")).sendKeys("Password@2019");
      driver.findElement(By.name("sub")).click();
      

}
}
