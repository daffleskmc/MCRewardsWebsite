package com.rewards.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rewards.base.RewardsBase;
import com.rewards.pages.home.RewardsHomeSGB;

public class RewardsLoginSGB extends RewardsBase {

	@FindBy(xpath = "//input[@id='ctl01_itxbEmail']")
	WebElement username;

	@FindBy(xpath = "//input[@id='ctl01_itxbPassword']")
	WebElement password;

	@FindBy(xpath = "//input[@id='ctl01_ctl01_ibtnSubmitLoginButton']")
	WebElement loginBtn;

	public RewardsLoginSGB() {
		PageFactory.initElements(driver, this);
	}

	public RewardsHomeSGB login(String url, String uname, String pwd) {
		driver.get(url);

		username.sendKeys(uname);
		password.sendKeys(pwd);
		// loginBtn.click();
		password.sendKeys(Keys.ENTER);

		return new RewardsHomeSGB();
	}

}
