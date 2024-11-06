package pojo;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class Token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	String response = 	given()
		.formParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.formParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.formParams("grant_type","client_credentials")
		.formParams("scope","trust")
		.when().log().all()
		.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token").asString();
	
	System.out.println(response);
	JsonPath jsonPath = new JsonPath(response);
	String accessToken = jsonPath.getString("access_token");
	
	
	GetCourse gc=	given()
		.queryParams("access_token", accessToken)
		.when().log().all()
		.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(GetCourse.class);
	
	System.out.println(gc.getLinkedin());
	System.out.println(gc.getInstructor());
	System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());
	
	
	}
}
			
			