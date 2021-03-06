package com.example.tests;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.AfterTest;



@RunWith(org.junit.runners.Parameterized.class)
public class Autotest {
private WebDriver driver;

private StringBuffer verificationErrors = new StringBuffer();
private static ChromeDriverService service;

@Parameters
public static Collection drivers() throws Exception
{
return Arrays.asList(new Object[][]{
{new FirefoxDriver()},
{new ChromeDriver(startService())},
{setInternetExpDr()}
});
}	

private static Object setInternetExpDr() 
{
System.setProperty("webdriver.ie.driver", "D:/IEDriverServer/IEDriverServer.exe"); 
return new InternetExplorerDriver();
}

public Autotest(WebDriver driver)
{
this.driver = driver;

}



public static ChromeDriverService startService() throws Exception{
service = new ChromeDriverService.Builder()
.usingDriverExecutable(new File("d:/chromedriver/chromedriver.exe"))
.usingAnyFreePort()
.build();
service.start();
return service;
}


@Before
public void setUp() throws Exception 
{


driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

//////////////////////////////////////////////////////////////////////////////////////
/////////                               TestbtnOne
///////////////////////////////////////////////////////////////////////////////////////  
@Test
public void testbt1() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");

isElementPresent(By.name("btnO"));
driver.findElement(By.name("btnOne")).click();
chekresalt("1","ReadOut");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}	



////////////////////////////////////////////////////////////////////////////////////////
///////////                        Testbt2
/////////////////////////////////////////////////////////////////////////////////////////  
@Test
public void testbt2() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
isElementPresent(By.name("btnTwo"));
driver.findElement(By.name("btnTwo")).click();
chekresalt("2","ReadOut");
}


////////////////////////////////////////////////////////////////////////////////////////
///////////                        TestbtnThree
/////////////////////////////////////////////////////////////////////////////////////////  
@Test
public void TestbtnThree() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
isElementPresent(By.name("btnThree"));
driver.findElement(By.name("btnThree")).click();
chekresalt("3","ReadOut");
}
////////////////////////////////////////////////////////////////////////////////////////
///////////                        TestbtnFour
/////////////////////////////////////////////////////////////////////////////////////////  
@Test
public void TestbtnFour() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
isElementPresent(By.name("btnFour"));
driver.findElement(By.name("btnFour")).click();
chekresalt("4","ReadOut");
}  


////////////////////////////////////////////////////////////////////////////////////////
///////////                        TestbtnFive
/////////////////////////////////////////////////////////////////////////////////////////  
@Test
public void TestbtnFive() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
isElementPresent(By.name("btnFive"));
driver.findElement(By.name("btnFive")).click();
chekresalt("5","ReadOut");
}  


////////////////////////////////////////////////////////////////////////////////////////
///////////                        TestbtnSix
/////////////////////////////////////////////////////////////////////////////////////////  
@Test
public void TestbtnSix() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
isElementPresent(By.name("btnSix"));
driver.findElement(By.name("btnSix")).click();
chekresalt("6","ReadOut");
}  



////////////////////////////////////////////////////////////////////////////////////////
///////////                     TestbtnSeven
/////////////////////////////////////////////////////////////////////////////////////////  
@Test
public void TestbtnSeven() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
isElementPresent(By.name("btnSeven"));
driver.findElement(By.name("btnSeven")).click();
chekresalt("7","ReadOut");
}  


////////////////////////////////////////////////////////////////////////////////////////
///////////                       TestbtnEight
/////////////////////////////////////////////////////////////////////////////////////////  
@Test
public void TestbtnEight() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
isElementPresent(By.name("btnEight"));
driver.findElement(By.name("btnEight")).click();
chekresalt("8","ReadOut");
}  

////////////////////////////////////////////////////////////////////////////////////////
///////////                       TestbbtnNine
/////////////////////////////////////////////////////////////////////////////////////////  
@Test
public void TestbtnNine() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
isElementPresent(By.name("btnNine"));
driver.findElement(By.name("btnNine")).click();
chekresalt("9","ReadOut");
}  
////////////////////////////////////////////////////////////////////////////////////////
///////////                       TestbbtnZ
/////////////////////////////////////////////////////////////////////////////////////////  
@Test
public void TestbtnZ() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnZ")).click();
chekresalt("0","ReadOut");
}  

////////////////////////////////////////////////////////////////////////////////////////
///////////                       Test1 12
/////////////////////////////////////////////////////////////////////////////////////////  
@Test
public void Test12() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnOne")).click();
driver.findElement(By.name("btnTwo")).click();
chekresalt("12","ReadOut");

}  
//////////////////////////////////////////////////////////////////////////////////////////
/////////////                       Test23
/////////////////////////////////////////////////////////////////////////////////////////// 

@Test
public void Test23() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.name("btnThree")).click();
chekresalt("23","ReadOut");

}
//    driver.findElement(By.name("btnClear")).click();
//////////////////////////////////////////////////////////////////////////////////////////
/////////////                       Test45
/////////////////////////////////////////////////////////////////////////////////////////// 
@Test
public void Test45() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnFour")).click();
driver.findElement(By.name("btnFive")).click();
chekresalt("45","ReadOut");
}
//    driver.findElement(By.name("btnClear")).click();
//////////////////////////////////////////////////////////////////////////////////////////
/////////////                       Test56
/////////////////////////////////////////////////////////////////////////////////////////// 
@Test
public void Test56() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnFive")).click();
driver.findElement(By.name("btnSix")).click();
chekresalt("56","ReadOut");
}
//    driver.findElement(By.name("btnClear")).click();
//////////////////////////////////////////////////////////////////////////////////////////
/////////////                       Testb78
/////////////////////////////////////////////////////////////////////////////////////////// 
@Test
public void Test78() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnSeven")).click();
driver.findElement(By.name("btnEight")).click();
chekresalt("78","ReadOut");
driver.navigate().refresh();
}
//    driver.findElement(By.name("btnClear")).click();
//////////////////////////////////////////////////////////////////////////////////////////
/////////////                       Test89
/////////////////////////////////////////////////////////////////////////////////////////// 
@Test
public void Test89() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnEight")).click();
driver.findElement(By.name("btnNine")).click();
chekresalt("89","ReadOut");
driver.navigate().refresh();
}
//    driver.findElement(By.name("btnClear")).click();
//////////////////////////////////////////////////////////////////////////////////////////
/////////////                       TestAllButtons
/////////////////////////////////////////////////////////////////////////////////////////// 
public void testUntitled() throws Exception 
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnOne")).click();
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.name("btnThree")).click();
driver.findElement(By.name("btnFour")).click();
driver.findElement(By.name("btnFive")).click();
driver.findElement(By.name("btnSix")).click();
driver.findElement(By.name("btnSeven")).click();
driver.findElement(By.name("btnEight")).click();
driver.findElement(By.name("btnNine")).click();
chekresalt("123456789","ReadOut");
driver.navigate().refresh();
}

//////////////////////////////////////////////////////////////////////////////////////////
/////////////                       TestPlus
/////////////////////////////////////////////////////////////////////////////////////////// 
@Test
public void TestPlus() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnOne")).click();
driver.findElement(By.name("btnPlus")).click();
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.id("btnWide")).click();
chekresalt("3","ReadOut");
driver.navigate().refresh();
}
//    driver.findElement(By.name("btnClear")).click();
//////////////////////////////////////////////////////////////////////////////////////////
/////////////                       TestMultiply
/////////////////////////////////////////////////////////////////////////////////////////// 
@Test
public void TestMultiply() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.name("btnMultiply")).click();
driver.findElement(By.name("btnFive")).click();
driver.findElement(By.id("btnWide")).click();
chekresalt("10","ReadOut");
driver.navigate().refresh();
}
//    driver.findElement(By.name("btnClear")).click();
//////////////////////////////////////////////////////////////////////////////////////////
/////////////                       TestDevide
/////////////////////////////////////////////////////////////////////////////////////////// 

public void TestDivide() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnEight")).click();
driver.findElement(By.name("btnDivide")).click();
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.id("btnWide")).click();
chekresalt("4","ReadOut");
driver.navigate().refresh();
}

//    driver.findElement(By.name("btnClear")).click();
//////////////////////////////////////////////////////////////////////////////////////////
/////////////                       TestMinus
/////////////////////////////////////////////////////////////////////////////////////////// 
public void TestMinus() throws Exception
{
driver.get("http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnSix")).click();
driver.findElement(By.name("btnMinus")).click();
driver.findElement(By.name("btnThree")).click();
driver.findElement(By.id("btnWide")).click();
chekresalt("3","ReadOut");
driver.navigate().refresh();
}
////////////////////////////////////////////////////////////////////////////////////////////
///////////////                       TestAll
///////////////////////////////////////////////////////////////////////////////////////////// 
@Test
public void testAll() throws Exception 
{
driver.get( "http://localhost:63342/Calc/Calc.html");
driver.findElement(By.name("btnOne")).click();
chekresalt("1","ReadOut");
driver.navigate().refresh();
driver.findElement(By.name("btnTwo")).click();
chekresalt("2","ReadOut");
driver.navigate().refresh();
driver.findElement(By.name("btnThree")).click();
chekresalt("3","ReadOut");
driver.navigate().refresh();
driver.findElement(By.name("btnFour")).click();
chekresalt("4","ReadOut");
driver.navigate().refresh();
driver.findElement(By.name("btnFive")).click();
chekresalt("5","ReadOut");
driver.navigate().refresh();
driver.findElement(By.name("btnSix")).click();
chekresalt("6","ReadOut");
driver.navigate().refresh();
driver.findElement(By.name("btnSeven")).click();
chekresalt("7","ReadOut");
driver.navigate().refresh();
driver.findElement(By.name("btnEight")).click();
chekresalt("8","ReadOut");
driver.navigate().refresh();
driver.findElement(By.name("btnNine")).click();
chekresalt("9","ReadOut");
driver.navigate().refresh();
driver.findElement(By.name("btnZ")).click();
chekresalt("0","ReadOut");
driver.navigate().refresh();
driver.findElement(By.name("btnOne")).click();
driver.findElement(By.name("btnNeg")).click();
chekresalt("-1","ReadOut");
driver.navigate().refresh();

//	    driver.findElement(By.name("btnClear")).click();

////////////////////12/////////////////    
driver.findElement(By.name("btnOne")).click();
driver.findElement(By.name("btnTwo")).click();
chekresalt("12","ReadOut");
driver.navigate().refresh();
//	    driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.name("btnThree")).click();
chekresalt("23","ReadOut");
driver.navigate().refresh();
//	    driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnFour")).click();
driver.findElement(By.name("btnFive")).click();
chekresalt("45","ReadOut");
driver.navigate().refresh();
//	    driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnFive")).click();
driver.findElement(By.name("btnSix")).click();
chekresalt("56","ReadOut");
driver.navigate().refresh();
//	    driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnSeven")).click();
driver.findElement(By.name("btnEight")).click();
chekresalt("78","ReadOut");
driver.navigate().refresh();
//	    driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnEight")).click();
driver.findElement(By.name("btnNine")).click();
chekresalt("89","ReadOut");
driver.navigate().refresh();
//	    driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnNine")).click();
driver.findElement(By.name("btnZ")).click();
driver.findElement(By.name("btnClear")).click();
chekresalt("90","ReadOut");
driver.navigate().refresh();

driver.findElement(By.name("btnOne")).click();
driver.findElement(By.name("btnPlus")).click();
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.id("btnWide")).click();
chekresalt("3","ReadOut");
driver.navigate().refresh();
//	    driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.name("btnPlus")).click();
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.id("btnWide")).click();
chekresalt("4","ReadOut");
driver.navigate().refresh();
//	    driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.name("btnMultiply")).click();
driver.findElement(By.name("btnFive")).click();
driver.findElement(By.id("btnWide")).click();
chekresalt("10","ReadOut");
driver.navigate().refresh();
//	    driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnEight")).click();
driver.findElement(By.name("btnDivide")).click();
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.id("btnWide")).click();
chekresalt("4","ReadOut");
driver.navigate().refresh();
//    
//	    driver.findElement(By.name("btnClear")).click();
driver.findElement(By.name("btnSix")).click();
driver.findElement(By.name("btnMinus")).click();
driver.findElement(By.name("btnThree")).click();
driver.findElement(By.id("btnWide")).click();
chekresalt("3","ReadOut");
driver.navigate().refresh();


driver.findElement(By.name("btnNine")).click();
driver.findElement(By.name("btnMultiply")).click();
driver.findElement(By.name("btnTwo")).click();
driver.findElement(By.id("btnWide")).click();
chekresalt("18","ReadOut");
driver.navigate().refresh();
}

public void chekresalt( String resalt, String elname)
{
assertEquals(resalt, driver.findElement(By.name("ReadOut")).getAttribute("value"));
}

@After
public void tearDown() throws Exception {
driver.quit();
String verificationErrorString = verificationErrors.toString();
if (!"".equals(verificationErrorString)) {
fail(verificationErrorString);
}
}

private boolean isElementPresent(By by) {
try {
driver.findElement(by);
return true;
} catch (NoSuchElementException e) {
e.printStackTrace();
return false;
}
}


}