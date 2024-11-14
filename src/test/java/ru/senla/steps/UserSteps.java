package ru.senla.steps;

import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;
import ru.senla.user.UserApi;

public class UserSteps {
    private UserApi userApi = new UserApi();

    @Step("Getting JSON user's")
    public ValidatableResponse getUser() {
        return userApi.getUser().then();
    }

}
