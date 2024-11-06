package apifirstdemo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import file.Payload;

public class APIfirstdemo {

	public static void main(String[] args) {
		
         //given -all input details 
		
		//when -Submit the api-https request, resource
		
		//then- Validate the response 
		
		
		RestAssured.baseURI="https://reqres.in";
		String response=given().log().all().header("Content-Type","application/json")
		.body(Payload.AddRegister())
		.when().post("api/users")
		
		.then().assertThat().statusCode(201).body("name",equalTo("morpheus")).extract().asString();
		
		System.out.println(response);
		
		JsonPath js= new JsonPath(response);
		String Name =js.getString("name");
		
		System.out.println(Name);
		
		//Put name
		
		
		given().log().all().queryParam("users",3).header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \""+Name+"\",\r\n"
						+ "    \"job\": \"zion resident\"\r\n"
						+ "}")
				.when().put("api/users")
				
				.then().assertThat().log().all().statusCode(200).body("name",equalTo("jhon"));
				
				//JsonPath js1= new JsonPath(putnameresponse);
				  //String name=js1.getString("name");
				//System.out.println(name);
		
		
		//GET name
		
		//String getnameresponse=given().log().all().queryParam("users",3).header("Content-Type","application/json")
		//.body("{\r\n"
			//	+ "    \"name\": \""+newname+"\",\r\n"
				//+ "    \"job\": \"zion resident\"\r\n"
				//+ "}")
		//.when().get("api/users/3")
		
		//.then().assertThat().statusCode(200).extract().asString();
		
		//JsonPath js2= new JsonPath(getnameresponse);
		 // String name1=js2.getString("newname");
		//System.out.println(name1);
		
		//String actualname=js2.getString("newname");
		
	//	System.out.println(newname);
		//Get Place
		
		
		
		
		
		
	}

}

