package Java.Sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegersToWordsTest {

	
	
	@Test
	public void checkSingleDigit()
	{
		
	    assertEquals("two",IntergersToWords.convertIntegersToWords("2".toCharArray())); 
	
	}
	@Test
	public void checkTwoDigits()
	{
		
	    assertEquals("thirty four",IntergersToWords.convertIntegersToWords("34".toCharArray())); 
	
	}
  
  @Test
  public void checkMoreThanThreeDigits()
	{
		
	    assertEquals("Length more than 3 is not supported",IntergersToWords.convertIntegersToWords("2345".toCharArray())); 
	
	}
  	
}
