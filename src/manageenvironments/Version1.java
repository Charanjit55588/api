package manageenvironments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import org.testng.annotations.Test;
import base.*;
import util.DateURLConnection;

public class Version1 extends AbstractBase {

	/*
	 * Instance variables declared as Static are, essentially, global variables.When
	 * objects of its class are declared, no copy of a static variable is made.
	 * Instead, all instances of the class share the same static variable.
	 */
	public static String baseurl = "https://api.imgur.com/account/v1/";
	public static String username = "charanjit9085";

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

	public String sendGet(String url) throws Exception {

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

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
		 */

		return (response.toString());

	}
}
