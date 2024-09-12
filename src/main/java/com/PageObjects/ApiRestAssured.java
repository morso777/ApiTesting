package com.PageObjects;

import com.google.gson.Gson;
import data.objects.OpenWheater;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class ApiRestAssured {


    protected Log log = LogFactory.getLog(this.getClass());


    public OpenWheater getList(String endpoint, String resourceAPI) {

        //Change endpoint
        RestAssured.baseURI = endpoint;
        RestAssured.useRelaxedHTTPSValidation();        //Request object
        RequestSpecification httpRequest = RestAssured.given();

        //change API          //Response object
        Response response = httpRequest.request(Method.GET, resourceAPI).
                then().header("content-type", "application/json; charset=utf-8").extract().response();
        Gson gson = new Gson();
        OpenWheater openWheater = gson.fromJson(response.getBody().asString(), OpenWheater.class);
        return openWheater;


    }




    public OpenWheater getListEquipment() {

        RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
        RestAssured.useRelaxedHTTPSValidation();
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET);
        Gson gson = new Gson();
        OpenWheater openWheater = gson.fromJson(response.getBody().asString(), OpenWheater.class);
        return openWheater;
    }
}
