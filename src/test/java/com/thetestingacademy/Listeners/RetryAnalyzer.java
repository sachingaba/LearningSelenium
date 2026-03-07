package com.thetestingacademy.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
  private  int count = 0;
  private  final int max = 3;

    @Override
    public boolean retry(ITestResult result) {

        if(max>count){
            count++;
            return true;
        }


        return false;
    }
}
