/**
 * 
 */
package util;

import java.net.HttpURLConnection;
import java.util.Date;

/**
 * @author csingh
 *
 */
public class DateURLConnection {
	
	public static void getDateUrlConnection(HttpURLConnection con) 
	{ 
		long date = con.getDate();
	    if (date == 0)
	      System.out.println("No date information.");
	    else
	      System.out.println("Date: " + new Date(date));
	}
}
