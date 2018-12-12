package imgur;

import org.json.JSONObject;
import org.testng.annotations.Test;

import manageenvironments.Version3;

public class AccountImages {
	Version3 obj = new Version3();
	protected static int getStatus;
	protected static Boolean getSuccess;

	public static void main(String s[]) throws Exception {
		
		Version3 obj = new Version3();
		System.out.println("Sending HTTP GET request 12345...");
		
		obj.setContentType("application/vnd.api+json");
		obj.setClientID("Bearer 52e73492a55ad026bb49f0dcf01d7056c613f59d");
		obj.setAgent("Mozilla/5.0");

		String value = obj.sendGet(Version3.baseurl+"/account/me/Images");

		JSONObject json = new JSONObject(value); 
		System.out.println("length= " + json.length());
		
		System.out.println((json.get("success")));
		System.out.println((json.get("status")));
		
	
}}
