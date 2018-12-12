package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import imgur.AccountImgur;

public class AssertAccount extends AccountImgur
{
 //test
	public static void assertResponseStatus() {
		Assert.assertEquals(AccountImgur.getStatus,"200", "Status Code is Response is expected/ OK");
		Assert.assertEquals(AccountImgur.getSuccess,"true", "Success is expected as true");
	}
  
}
