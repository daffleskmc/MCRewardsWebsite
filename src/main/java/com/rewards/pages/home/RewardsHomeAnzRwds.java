package com.rewards.pages.home;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.rewards.base.RewardsBase;
import com.rewards.util.RewardsUtil;

public class RewardsHomeAnzRwds extends RewardsBase implements RewardsHomeAnz {

	// WebElement

	public RewardsHomeAnzRwds() {
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
}
