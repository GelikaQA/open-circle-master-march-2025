package tools;

import io.restassured.filter.cookie.CookieFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiHelper {
    private final CookieFilter cookieFilter = new CookieFilter();

    public String getCsrfToken() {
        Response response =
        given()
                .filter(cookieFilter)
                .baseUri(PropertiesLoader.getProperties("apiBaseUrl"))
        .when()
                .get(PropertiesLoader.getProperties("csrfToken.endpoint"))
        .then()
                .extract().response();

        return response.jsonPath().getString("csrfToken");
    }

    public Map<String, String> login(String email, String plainPassword, String csrfToken) {
        String encodedPassword = Base64.getEncoder()
                .encodeToString(plainPassword.getBytes(StandardCharsets.UTF_8));

        Response loginResponse =
        given()
                .filter(cookieFilter)
                .baseUri(PropertiesLoader.getProperties("apiBaseUrl"))
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .accept("application/json")
                .formParam("csrfToken", csrfToken)
                .formParam("email", email)
                .formParam("password", encodedPassword)
                .formParam("redirect", "false")
                .formParam("json", "true")
                .formParam("callbackUrl", PropertiesLoader.getProperties("signInUrl"))
        .when()
                .post(PropertiesLoader.getProperties("login.endpoint"));

        return loginResponse.getCookies();
    }

    public void deleteCircle() {
        given()
                .filter(cookieFilter)
                .baseUri(PropertiesLoader.getProperties("apiBaseUrl"))
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{}")
        .when()
                .delete(PropertiesLoader.getProperties("circle.endpoint"))
        .then()
                .statusCode(200);
    }

    public String getUserIdByEmail(String email) {
        Response response =
        given()
                .filter(cookieFilter)
                .baseUri(PropertiesLoader.getProperties("apiBaseUrl"))
        .when()
                .get(PropertiesLoader.getProperties("users.endpoint"))
        .then()
                .extract().response();

        List<Map<String, Object>> users = response.jsonPath().getList("");

        for (Map<String, Object> user : users) {
            if (email.equals(user.get("email"))) {
                return (String) user.get("id");
            }
        }
        return null;
    }

    public void deleteUserById(String userId) {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("id", userId);

        given()
                .filter(cookieFilter)
                .baseUri(PropertiesLoader.getProperties("apiBaseUrl"))
                .contentType(ContentType.JSON)
                .body(requestBody)
        .when()
                .delete(PropertiesLoader.getProperties("users.endpoint") )
        .then()
                .statusCode(200);
    }
}