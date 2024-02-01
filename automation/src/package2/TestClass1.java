package package2;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;



import package1.Private;


public class TestClass1 {
//public static void 
	@Test
	public void tc1() {
		DOMConfigurator.configure("log4j.xml");
		Private cls = new Private();
		cls.openApplication();
		cls.login();
		cls.logout();
		cls.closeApplication();
	}}




