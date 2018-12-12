/**
 * 
 */
package base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author csingh
 *An abstract class is a class that is declared abstract—it may or may not include abstract methods. 
 *Abstract classes cannot be instantiated, but they can be sub-classed.
 */
 public abstract class AbstractBase {
	 
	/* An abstract class may have static fields and static methods. 
	 * You can use these static members with a class reference 
	 * (for example, AbstractClass.staticMethod())
	 * as you would with any other class.
	 */
	public String ContentType;
	public String ClientId;
	public String USER_AGENT;
	
	public abstract void setContentType(String ContentType1);
	public abstract void setClientID(String ClientId1);	
	public abstract void setAgent(String USER_AGENT1);
	

	
}
