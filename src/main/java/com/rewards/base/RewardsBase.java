package com.rewards.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.rewards.util.RewardsUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RewardsBase {

	public static WebDriver driver;

	public static Properties props;

	// public static EventFiringWebDriver e_driver;

	public RewardsBase() {
		props = new Properties();
		try {
			FileInputStream fis = new FileInputStream("D:\\DCruz\\config_data\\config.properties");
			props.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browser = props.getProperty("browser");

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		// e_driver = new EventFiringWebDriver(driver);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(RewardsUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(RewardsUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		// driver.get(props.getProperty("url"));

	}
}
