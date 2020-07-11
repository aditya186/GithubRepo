import io.restassured.RestAssured;

public class ES {

	public static void main(String[] args) {
	
//		System.setProperty("javax.net.ssl.trustStore","clientTrustStore.key");
//
//		System.setProperty("javax.net.ssl.trustStorePassword","qwerty");
		
    RestAssured.baseURI= "https://api-test1.test.intranet";
    String resp1 = RestAssured.given().queryParam("wireCenter", "MRCHPAMA").header("Content-Type","application/json")
				  .auth().preemptive()
				  .basic("geoestst", "3QTC775gyeAb4FDFyEEUcJC8")
				  .when()
				  .get("/Inventory/v1/Location/wireCenterLocation")
				  .then()
				  .assertThat().log().all().statusCode(200).extract().response().asString();
		  
	
	System.out.println("code is" +resp1);
	  }
	}
	


//>>>>>>>>>>>>>>>>>>>>>

//String getPlaceResponse=	given().log().all().queryParam("key", "qaclick123")
//.queryParam("place_id",placeId)
//.when().get("maps/api/place/get/json")
//.then().assertThat().log().all().statusCode(200).extract().response().asString();
//JsonPath js1=ReUsableMethods.rawToJson(getPlaceResponse);
//String actualAddress =js1.getString("address");
//System.out.println(actualAddress);
//Assert.assertEquals(actualAddress, newAddress);
//Cucumber Junit, Testng
