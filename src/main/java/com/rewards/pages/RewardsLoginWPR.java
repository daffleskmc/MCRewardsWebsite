package com.rewards.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rewards.base.RewardsBase;

public class RewardsLoginWPR extends RewardsBase {

	@FindBy(xpath = "//input[@id='UcLoginHomePage_itxbLoginField']")
	WebElement username;

	@FindBy(xpath = "//input[@id='UcLoginHomePage_itxbPassword']")
	WebElement password;

	@FindBy(xpath = "//input[@id='UcLoginHomePage_ibtnSubmitLogin']")
	WebElement loginBtn;

	public RewardsLoginWPR() {
		PageFactory.initElements(driver, this);
	}

	public RewardsLoginWPR login(String url, String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();

		return new RewardsLoginWPR();
	}
}
