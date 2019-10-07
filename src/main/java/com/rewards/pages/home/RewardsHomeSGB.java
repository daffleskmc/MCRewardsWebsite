package com.rewards.pages.home;

import org.openqa.selenium.support.PageFactory;

import com.rewards.base.RewardsBase;
import com.rewards.util.RewardsUtil;

public class RewardsHomeSGB extends RewardsBase {

	public RewardsHomeSGB() {

		PageFactory.initElements(driver, this);

		try {
			// Thread.sleep(5000);

			RewardsUtil.takeScreenshot();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getTitle() {
		return driver.getTitle();
	}

}
