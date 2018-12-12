/**
 * 
 */
package base;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author csingh
 *
 */
public class HttpConnection {
    String url;
    HttpURLConnection con;
    URL obj ;
    
	/*public HttpConnection(String url) throws IOException
	{
		URL obj = new URL(this.url);
		con = (HttpURLConnection) obj.openConnection();
		return;
	
	}*/
    
    public void geturl(String url) throws IOException
    {
       	obj = new URL(this.url);
		
    }
	public  HttpURLConnection getData() throws IOException
	{
		  con = (HttpURLConnection) obj.openConnection();
			return con;
	}
  
	
	public void setRequestProperty(String string, String contentType) {
		// TODO Auto-generated method stub
		
	}
	public int getResponseCode() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getContentType() {
		// TODO Auto-generated method stub
		return null;
	}
}
