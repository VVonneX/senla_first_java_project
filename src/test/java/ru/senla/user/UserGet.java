package ru.senla.user;

import com.google.gson.Gson;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.senla.steps.UserSteps;

public class UserGet {
    private UserSteps steps = new UserSteps();

    @Test
    public void getUserTest() {
        ValidatableResponse response = steps.getUser();
        response.assertThat().statusCode(200);
        String userJson = response.extract().body().asString();
        Gson gson = new Gson();
        User actual = gson.fromJson(userJson, User.class);
        Assert.assertNotNull(actual.getResults());
        Assert.assertNotNull(actual.getInfo());
    }
}
