package weather;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.get;

public class TC1 {

    @Test (priority = 1)
    public void testResponsecode ()
    {
        //Response resp =get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        int code=resp.getStatusCode();
        System.out.println("Status code is "+code);
        Assert.assertEquals(code, 200);
    }

    @Test (priority = 2)
    public void corto ()
    {
        Response resp =get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        //Response resp =RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        String data=resp.asString();
        System.out.println("Data is "+ data);
        System.out.println("Response time short "+resp.getTime());
    }

    @Test (priority = 3)
    public void largo ()
    {
        long time= get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
        System.out.println("Response time long "+time);
    }

}



