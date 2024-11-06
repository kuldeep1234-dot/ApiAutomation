package serilization;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.response.Response;

public class SerilizationTest {

	public static void main(String[] args) {
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		List<String>myList= new ArrayList<String>();
		myList.add("shoe");
		myList.add("pages");
		Place p= new Place();
		p.setAccuracy(50);
		p.setAddress("YashwantNagar");
		p.setLanguage("English");
		p.setPhone_number("+91-8237303246");
		p.setWebsite("https://KuldeepShimpi.com");
		p.setName("Kuldeep");
		p.setTypes(myList);
		Location l= new Location();
		l.setLat(23.999);
		l.setLng(23.499);
		p.setLocation(l);
		Response res=given().queryParam("key","qaclick123").body(p).when().post("/maps/api/place/add/json")
				.then().assertThat().statusCode(200).extract().response();
	
		String responseString = res.asString();
		System.out.println(responseString);
		
		

	}

}
