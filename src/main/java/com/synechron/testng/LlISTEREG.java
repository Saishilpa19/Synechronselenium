package com.synechron.testng;

import org.testng.TestListenerAdapter;
import org.testng.ITestResult;

public class LlISTEREG extends TestListenerAdapter  {
	
		  private int m_count = 0;

		  @Override
		  public void onTestFailure(ITestResult tr) {
		    log("F");
		  }

		  @Override
		  public void onTestSkipped(ITestResult tr) {
		    log("S");
		  }

		  @Override
		  public void onTestSuccess(ITestResult tr) {
		    log(".");
		  }

		  private void log(String string) {
		    System.out.print(string);
		    if (++m_count % 40 == 0) {
		      System.out.println(" ");
		    }
		  }
		}
}
