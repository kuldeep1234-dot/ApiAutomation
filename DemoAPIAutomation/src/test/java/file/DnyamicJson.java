package file;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DnyamicJson {

@Test(dataProvider="BooksData")


public void addBook(String isbn,String aisle)
{

RestAssured.baseURI="http://216.10.245.166";

  String resp =given().log().all().header("Content-Type","application/json").body(Payload.Addbook(isbn,aisle))
.when()
.post("/Library/Addbook.php")
.then().assertThat().statusCode(200)
.extract().response().asString();
  JsonPath js = new JsonPath(resp);
  String id= js.get("ID");
  
  System.out.println(id);


}

@DataProvider(name="BooksData")
public Object[][] getData()

{
	return new Object[][] {{"kgfrr","8977"},{"trsss","9999"},{"treee","7877"}};
}
}






