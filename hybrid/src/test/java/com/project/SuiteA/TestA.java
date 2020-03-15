package com.project.SuiteA;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

public class TestA {
  @Test(dataProvider = "dp")
  public void f(String s,String x) {
	  System.out.println("Im in TestA");
  }

  @DataProvider
  public Object[][] dp() {
    
	  Object[][] data=new Object[2][2];
	  data[0][0]="Visala";
	  return data;
	  
  }
 

}
