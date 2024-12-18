package ru.senla.steps;

import com.google.gson.Gson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.senla.user.User;
import ru.senla.user.UserApi;

public class UserStepTest{
    private UserApi userApi = new UserApi();

    @When("Инициализавция запроса")
    @When("Инициализавция запроса для регрессионного тестирования")
    public ValidatableResponse getUser() {
        return userApi.getUser().then();
    }

    @Then("Успешно получаем код запрос и JSON")
    @Then("Успешно получаем код запрос и JSON для регрессионного тестирования")
    public void getUserTest() {
        ValidatableResponse response = getUser();
        response.assertThat().statusCode(200);
        String userJson = response.extract().body().asString();
        Gson gson = new Gson();
        User actual = gson.fromJson(userJson, User.class);
        Assert.assertNotNull(actual.getResults());
        Assert.assertNotNull(actual.getInfo());
    }

}
