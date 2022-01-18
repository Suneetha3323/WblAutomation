package com.wbl.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class LoggerListener extends TestListenerAdapter{
	 Logger Log = LogManager.getLogger(LoggerListener.class);
//	private int m_count = 0;

	   @Override
	   public void onTestFailure(ITestResult tr) {
	      Log.info(tr.getName()+ "--Test method failed\n");
	   }

	   @Override
	   public void onTestSkipped(ITestResult tr) {
	      Log.info(tr.getName()+ "--Test method skipped\n");
	   }

	   @Override
	   public void onTestSuccess(ITestResult tr) {
	      Log.info(tr.getName()+ "--Test method success\n");
	   }
}


