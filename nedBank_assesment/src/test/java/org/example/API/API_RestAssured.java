package org.example.API;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class API_RestAssured {

    @Test
    void getUniversityName(){

       String getName =given()
                .contentType(ContentType.JSON)
                .when()
                .get("http://universities.hipolabs.com/search?country=South+Africa")
                .jsonPath().getString("name");

       System.out.println(getName);


    }
}
