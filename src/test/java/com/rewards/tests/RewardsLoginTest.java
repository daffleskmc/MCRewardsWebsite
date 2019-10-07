package com.rewards.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rewards.base.RewardsBase;
import com.rewards.pages.RewardsLoginANZ;
import com.rewards.pages.RewardsLoginSGB;
import com.rewards.pages.home.RewardsHomeAnz;
import com.rewards.pages.home.RewardsHomeSGB;
import com.rewards.util.RewardsUtil;

public class RewardsLoginTest extends RewardsBase {

	RewardsLoginANZ loginAnz;

	RewardsHomeAnz homeAnz;

	RewardsLoginSGB loginSgb;

	RewardsHomeSGB homeSgb;

	String sheetNameAnz = "login_anz";

	String sheetNameSgb = "login_sgb";

	public RewardsLoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginAnz = new RewardsLoginANZ();
		loginSgb = new RewardsLoginSGB();
	}

	@DataProvider
	public Object[][] getLoginTestDataAnz() {
		Object data[][] = RewardsUtil.getTestData(sheetNameAnz);
		return data;
	}

	@DataProvider
	public Object[][] getLoginTestDataSgb() {
		Object data[][] = RewardsUtil.getTestData(sheetNameSgb);
		return data;
	}

	// @Test(dataProvider = "getLoginTestDataAnz")
	// public void loginAnz(String url, String uname, String pwd) {
	// homeAnz = loginAnz.login(url, uname, pwd);
	// String anzRwdsTitle = homeAnz.getAnzRwdsTitle();
	//
	// if (url.contains("anzrewards")) {
	// Assert.assertEquals(anzRwdsTitle, "ANZ Rewards - Home");
	// } else if (url.contains("business")) {
	// Assert.assertEquals(anzRwdsTitle, "ANZ Business Rewards - Login");
	// } else { // visa
	// Assert.assertEquals(anzRwdsTitle, "ANZ Balance Visa - Login");
	//
	// }
	// }

	@Test(dataProvider = "getLoginTestDataSgb")
	public void loginSgb(String url, String uname, String pwd) {
		homeSgb = loginSgb.login(url, uname, pwd);
		String sgbTitle = homeSgb.getTitle();
		Assert.assertEquals(sgbTitle, "Amplify Rewards - Member Login");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
