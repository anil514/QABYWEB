package capgemini.prep;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Retry implements IRetryAnalyzer{
	private int count = 0;
    private static int maxTry = 3;

	public boolean retry(ITestResult result) {
		if(!result.isSuccess()) {
			if(count<maxTry) {
				count++;                                     //Increase the maxTry count by 1
                result.setStatus(ITestResult.FAILURE);
                return true;
			}else {
				result.setStatus(ITestResult.FAILURE);
			}
		}else {
			result.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}

}
