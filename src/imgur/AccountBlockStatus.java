package imgur;

import org.json.JSONObject;
import org.testng.annotations.Test;

import manageenvironments.Version1;
import util.DateURLConnection;

public class AccountBlockStatus {

	protected static int getStatus;
	protected static Boolean getSuccess;

	public static void main(String s[]) throws Exception {
		Version1 obj = new Version1();
		

		System.out.println("Sending HTTP GET request 12345...");
		
		obj.setContentType("application/vnd.api+json");
		obj.setClientID("Bearer 52e73492a55ad026bb49f0dcf01d7056c613f59d");
		obj.setAgent("Mozilla/5.0");

		String value = obj.sendGet(Version1.baseurl+Version1.username+"/block");

		JSONObject json = new JSONObject(value); 
		System.out.println("length= " + json.length());

		JSONObject json1 = (JSONObject) json.get("data");
		System.out.println("json1" + json1);
		
		System.out.println((json1.get("blocked")));

	}
}
