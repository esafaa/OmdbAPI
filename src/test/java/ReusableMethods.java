import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ReusableMethods {

        String url="https://www.omdbapi.com/";
        String apiKey= "yourkey";
    public String search(String text, int page){
        Response resp= given()
                .param("s", text)
                .param("apikey",apiKey)
                .param("page", page)
                .when()
                .get(url);

        return resp.prettyPrint();
    }
}
