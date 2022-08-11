package com.crm.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImpIn implements ITestListener {

	public void onTestStart(ITestResult result) {

	}
	public void onTestSuccess(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		System.out.println("<---------------------I am Listner-------------->");

		TakesScreenshot screenshot=(TakesScreenshot)BaseClass.sdriver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		LocalDateTime LSD=LocalDateTime.now();
		String datetime = LSD.toString().replace("", "_").replace(":", "_");
		File dest = new File("screenShots/"+"_"+testname+"_"+datetime+".PNG");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("problem is saving screenshot"+e.getMessage());
		}

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
