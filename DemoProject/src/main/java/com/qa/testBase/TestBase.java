package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.DashboardPage;
import com.qa.pageLayer.ExchangePage;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.Purches;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public static Logger logger;
	public LoginPage login;
	public DashboardPage dashboard;
	public ExchangePage exchange;
	public Purches purches;

	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("Demo Project");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Framework execution start");
	}

	@AfterClass
	public void stop()
	{
		logger.info("Framework execution stop");
	}

	@Parameters("Browser")
	@BeforeMethod
	public void setUp(String br)
	{
		if(br.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			logger.info("Edge Browser is ready for automation");
		}
		else if(br.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("chrome Browser is ready for automation");
		}
		else if(br.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.info("Firefox Browser is ready for automation");
		}
		else
		{
			logger.info("please enter valid browser name");
		}

		driver.manage().window().maximize();
		logger.info("Browser window maximize");

		driver.manage().deleteAllCookies();
		driver.get("https://www.apps.dalalstreet.ai/login");
		//driver.get("https://blazedemo.com/index.php");
		logger.info("Dalastreet application open successfully");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("Actitime web application is ready for automation");

		login = new LoginPage();
		dashboard = new DashboardPage();
		exchange = new ExchangePage();
		purches = new Purches();
	}


	@AfterMethod
	public void tearDown()
	{
	//	driver.close();
		logger.info("close the browser");
	}

}
