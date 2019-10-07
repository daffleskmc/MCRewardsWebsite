package com.rewards.pages.home;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rewards.base.RewardsBase;
import com.rewards.util.RewardsUtil;

public class RewardsHomeAnzVisa extends RewardsBase implements RewardsHomeAnz {

	@FindBy(xpath = "//h1[text()='Welcome Arcot']")
	WebElement acctName;

	public RewardsHomeAnzVisa() {
		PageFactory.initElements(driver, this);

		try {
			RewardsUtil.takeScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getAnzRwdsTitle() {
		return driver.getTitle();
	}

	public String getAcctName() {
		return acctName.getText();
	}
}
