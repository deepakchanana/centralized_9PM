package pkg1;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadriventesting 
{
  @Test(groups="Smoke")	
  public void testcase1()
  {
	System.out.println("Smoke testcase");  
  }

  @Test(groups="Smoke")
  public void testcase2()
  {
	System.out.println("Smoke testcase");  
  }
  
  @Test(groups="Smoke")	
  public void testcase3()
  {
	System.out.println("Smoke testcase");  
  }
  @Test(groups="Smoke")
  public void testcase4()
  {
	System.out.println("Smoke testcase");  
  }
  
  @Test(groups="Sanity")
  public void testcase1323()
  {
	System.out.println("Sanity testcase");  
  }
  @Test(groups="Sanity")	
  public void testcase1223()
  {
	System.out.println("Sanity testcase");  
  }
  @Test(groups="Sanity")	
  public void testcase1333()
  {
	System.out.println("Sanity testcase");  
  }
  @Test(groups="Sanity")	
  public void testcase133()
  {
	System.out.println("Sanity testcase");  
  }
}
