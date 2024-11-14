package ru.senla.user;

import io.restassured.response.Response;
import ru.senla.baseurl.BaseHttpClient;

public class UserApi extends BaseHttpClient {
    private final String apiPath = "/api/";

    public Response getUser() {
        return doGetRequest(apiPath);
    }
}
