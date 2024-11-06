package dayonerestassured;

import java.util.HashMap;
import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class CreatingPostRequest 

{
	//@Test(priority=1)
	void PostRequest()
	{
		
		HashMap data = new HashMap();
		data.put("name","Jhonny");
		data.put("job","worker");
		
		given().contentType("application/json").body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then().statusCode(201).header("Content-Type","application/json; charset=utf-8")
		.log().all();
				
	}
	//@Test(priority=2)
	void testDelete()
	{
		given()
		
		.when().delete("https://reqres.in/api/users/2")
		
		.then().statusCode(204);
	}
	
	//Post request body using org.json 
	@Test(priority=1)
	void PostRequestusingOrgJson()
	{
		
		JSONObject data =new JSONObject();
		 data.put("name","Kuldeep");
		 data.put("job", "FieldWorker");
		 
		given().contentType("application/json").body(data.toString())
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then().statusCode(201).header("Content-Type","application/json; charset=utf-8")
		.log().all();
				
	}

}
