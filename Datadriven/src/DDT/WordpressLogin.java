package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WordpressLogin {
	
	WebDriver driver;
	@Test(dataProvider="wordpressData")
	public void loginToWordpress(String username, String Password) throws InterruptedException
	{
	 System.setProperty("webdriver.gecko.driver", "D:\\Software\\Selenium Software\\geckodriver.exe");
	 //WebDriver driver=new ChromeDriver();  
     //System.out.println("Hello Google..."); 
   //FirefoxProfile firefoxProfile = new FirefoxProfile();
   //firefoxProfile.setPreference("reader.parse-on-load.enabled",false);
    driver = new FirefoxDriver();
     //driver.get("https://efwp.annik.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlywait(20,TimeUnit.SOCONDS);
	
	driver.get("http://www.reportingse.com/esat/");
	driver.findElement(By.id("txtusername")).sendKeys(username);
	driver.findElement(By.id("txtpwd")).sendKeys(Password);
   driver.findElement(By.id("loginBtn")).click();
   
   Thread.sleep(5000);
  // System.out.println(driver.getTitle());
   
   Assert.assertTrue(driver.getTitle().contains("Dashboard")," User is not able to login- Invalid credentials");
   
   System.out.println("Page Title verified- User is able to login successfully");
   
   

}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
	
	@DataProvider(name="wordpressData")
	public Object[][] passData(){
	ExcelDataConfig	config= new ExcelDataConfig("\\Workspace_Videotutorial\\LearnAutomation\\TestData\\InputData.xlsx");
	int rows=config.getRowCount(0);
			
	Object[][] data=new Object[rows][2];
	
	for(int i=0; i<rows; i++){
		
		data[i][0]=config.getData(0,i,0);
		data[i][1]=config.getData(0,i,1);
	}
	
	
	return data;
	}
	
}
