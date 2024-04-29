package generic_lib;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("from before suite",true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("from after suite",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("from before test",true);
	}
	@AfterTest
	public void AfterTest() {
		Reporter.log("from after test",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("from before class",true);
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("from after class",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("from before method",true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("from after method",true);
	}
}
