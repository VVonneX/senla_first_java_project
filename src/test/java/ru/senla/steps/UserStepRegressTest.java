package ru.senla.steps;

import com.google.gson.Gson;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import ru.senla.user.User;
import ru.senla.user.UserApi;

@CucumberOptions(
        features = "src/test/resources/scenarios",
        glue = "ru.senla.user", // Убедитесь, что это соответствует пакету ваших определений шагов
        tags = "@regress",
        snippets = CucumberOptions.SnippetType.UNDERSCORE
)
public class UserStepRegressTest  extends AbstractTestNGCucumberTests {
    private UserApi userApi = new UserApi();

    @When("Инициализавция запроса для регрессионного тестирования")
    public ValidatableResponse getUserRegress() {
        return userApi.getUser().then();
    }

    @Then("Успешно получаем код запрос и JSON для регрессионного тестирования")
    public void getUserRegressTest() {
        ValidatableResponse response = getUserRegress();
        response.assertThat().statusCode(200);
        String userJson = response.extract().body().asString();
        Gson gson = new Gson();
        User actual = gson.fromJson(userJson, User.class);
        Assert.assertNotNull(actual.getResults());
        Assert.assertNotNull(actual.getInfo());
    }

}
