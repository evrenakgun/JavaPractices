import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static io.restassured.RestAssured.given;

public class RestAssuredTest {

	@Test
	public void singleUserBddTest() {
		when() //RequestSender
				.get("https://reqres.in/api/users/2") // Response
				.then() //ValidatableResponse
				.statusCode(200)
				.body("data.email", equalTo("janet.weaver@reqres.in"))
				.time(lessThan(1000L));
		
	}
	
	// Bu da diğer yolu.
	@Test
	public void singleUserTest() {
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification httpRequestSpecification = given();
		Response response = httpRequestSpecification.get("/api/users/2");
		ResponseBody body = response.getBody();
		String bodyAsString = body.asString();
		System.out.println(bodyAsString);
		Assert.assertTrue(bodyAsString.contains("janet.weaver@reqres.in"), "String did not found");
	}
	
	@Test
	public void createUserTest() {
		String postData = "{\n" + 
				" \"name\": \"morpheus\",\n" +
				" \"job\": \"leader\"\n" +
				"}";
		given()
				.contentType(ContentType.JSON)
				.body(postData)
				.when()
				.post("https://reqres.in/api/users")
				.then()
				.statusCode(201)
				.body("name", equalTo("morpheus"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}