package org.example.API.stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.net.URI;
import java.net.URISyntaxException;

public class GetStepdefs {

    private final String BASE_URL="https://reqres.in/";
    private Response response;
    int actualResponseCode;
    int statusCodeInt;

    @Given("Get call to {string}")
    public void getCallTo(String url) throws URISyntaxException {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification requestSpecification = RestAssured.given();
        response = requestSpecification.when().get(new URI(url));
    }

    @Then("Response is {string}")
    public void responseIs(String statusCode) {
        actualResponseCode = response.then().extract().statusCode();
        statusCodeInt = Integer.parseInt(statusCode);
        Assert.assertEquals(statusCodeInt, actualResponseCode);
    }

    @Then("Response first_name is {string}")
    public void responseFirst_nameIs(String arg0) {
//        String firstName = response.then().extract().body().path("data");

//        System.out.println("FirstName:\t"+firstName);

        String prettyBody = response.getBody().prettyPrint();
        JsonPath js = new JsonPath(prettyBody); //for parsing Json
        String email=js.getString("first_name");

        System.out.println("Body Response:\t"+email);


//        Assert.assertEquals(arg0,firstName);
    }
}
