package manageenvironments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;

import base.AbstractBase;
import base.HttpConnection;
import util.DateURLConnection;

public class Version3 extends AbstractBase{
	//If you want to call a variable with its class name into another package then declare it as public static
	//e.g. Version3.baseurl 
	public static String  baseurl = "https://api.imgur.com/3";
	public static String  username = "charanjit9085";
	@Override
	public void setContentType(String ContentType1) {
		// TODO Auto-generated method stub
		ContentType = ContentType1;		
	}
	@Override
	public void setClientID(String ClientId1) {
		// TODO Auto-generated method stub
		ClientId = ClientId1;		
	}
	@Override
	public void setAgent(String USER_AGENT1) {
		// TODO Auto-generated method stub
		USER_AGENT = USER_AGENT1;
		
	}
	
	
	public void Header(HttpURLConnection con) throws IOException {
		
		
		con.setRequestProperty("Content-Type", ContentType);
		con.setRequestProperty("Authorization", ClientId);
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		String contentType = con.getContentType();
		int responseMessage = con.getResponseCode();

		System.out.println("Response Code : " + responseCode);
		System.out.println("Content Type : " + contentType);
		System.out.println("Response Message : " + responseMessage);
	}
	
	
  
	
	public  String sendGet(String url) throws Exception {
		// String url = "https://api.imgur.com/3/account/charanjit9085";
        
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		
		
		DateURLConnection.getDateUrlConnection(con);
		
		// Request header
		con.setRequestProperty("Content-Type", ContentType);
		con.setRequestProperty("Authorization", ClientId);
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		String contentType = con.getContentType();
		String responseMessage = con.getResponseMessage();

		System.out.println("Response Code : " + responseCode);
		System.out.println("Content Type : " + contentType);
		System.out.println("Response Message : " + responseMessage);
		

		// Reader start
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		// Reader ends

		// prints the complete response
		System.out.println(response.toString());

		/*
		 * conversion process JSON to string // toString(); so that we can print it.
		 * then to JSONObject. This is important if you have to access the fields inside
		 * json.
		 * 
		 * 
		 */

		return (response.toString());

	}

	
}
