package com.testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
  @Test(description = "my first test case ",priority = 1)
  public void executeUrl()
  {
    System.out.println("TestNG") ;
  }
  @Test
  public void aMethod()
  {
	  System.out.println("A method is executed") ;
  }
  
}
