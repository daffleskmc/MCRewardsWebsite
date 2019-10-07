package com.rewards.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rewards.base.RewardsBase;
import com.rewards.pages.home.RewardsHomeAnz;
import com.rewards.pages.home.RewardsHomeAnzBns;
import com.rewards.pages.home.RewardsHomeAnzRwds;
import com.rewards.pages.home.RewardsHomeAnzVisa;

public class RewardsLoginANZ extends RewardsBase {

	@FindBy(xpath = "//input[@id='ctl01_itxbEmail']")
	WebElement usernameRwds;

	@FindBy(xpath = "//input[@id='ctl01_itxbPassword']")
	WebElement passwordRwds;

	@FindBy(xpath = "//input[@id='ctl01_ctl01_ibtnSubmitLoginButton']")
	WebElement loginBtn;

	@FindBy(xpath = "//input[@id='ctl00_itxbEmail']")
	WebElement usernameBns;

	@FindBy(xpath = "//input[@id='ctl00_itxbPassword']")
	WebElement passwordBns;

	@FindBy(xpath = "//input[@id='ctl00_ctl00_ibtnSubmitLoginButton']")
	WebElement loginBns;

	@FindBy(xpath = "//input[@id='ctl02_itxbEmail']")
	WebElement usernameVisa;

	@FindBy(xpath = "//input[@id='ctl02_itxbPassword']")
	WebElement passwordVisa;

	@FindBy(xpath = "//input[@id='ctl02_ctl02_ibtnSubmitLoginButton']")
	WebElement loginVisa;

	public RewardsLoginANZ() {
		PageFactory.initElements(driver, this);
	}

	public RewardsHomeAnz login(String url, String uname, String pwd) {
		driver.get(url);

		if (url.contains("anzrewards")) {
			usernameRwds.sendKeys(uname);
			passwordRwds.sendKeys(pwd);
			loginBtn.click();
			return new RewardsHomeAnzRwds();
		} else if (url.contains("business")) {
			usernameBns.sendKeys(uname);
			passwordBns.sendKeys(pwd);
			loginBns.click();
			return new RewardsHomeAnzBns();
		} else { // visa
			usernameVisa.sendKeys(uname);
			passwordVisa.sendKeys(pwd);
			loginVisa.click();
			return new RewardsHomeAnzVisa();

		}
	}

}
