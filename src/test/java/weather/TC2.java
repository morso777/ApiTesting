package weather;

import com.PageObjects.ApiRestAssured;
import com.PageObjects.BaseTest;
import data.objects.Main;
import data.objects.OpenWheater;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TC2 extends BaseTest {


    ApiRestAssured apiRestAssured;

    @Test(priority = 1)
    public void filter() throws InterruptedException {
        System.out.println("=====VALIDATING  =====");
        apiRestAssured = new ApiRestAssured();

        OpenWheater openWheater = apiRestAssured.getListEquipment();
        Stream<String> streamDeStrings= Stream.of(String.valueOf(openWheater));
        System.out.println("Data: " + streamDeStrings);

        //String A = apiRestAssured.getListEquipment();
        //String foo1 = apiRestAssured.getListEquipment();
    }
}
