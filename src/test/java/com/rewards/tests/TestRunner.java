package com.rewards.tests;

import org.testng.TestNG;

import com.rewards.util.ExtentReportListener;

public class TestRunner {

	static TestNG testNg;

	public static void main(String[] args) {

		ExtentReportListener ext = new ExtentReportListener();

		testNg = new TestNG();

		testNg.setTestClasses(new Class[] { RewardsLoginTest.class });
		testNg.addListener(ext);
		testNg.run();
	}

}
