import com.jayway.jsonpath.JsonPath;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestOmdbApi extends ReusableMethods {

    String response;


    @Test
    public void practice(){
        //1. Using search method, search for all items that match the search string "stem"
    response =search("stem", 1);
    //2. Assert that the result should contain at least 30 items
        String totalnum= JsonPath.read(response, "$.totalResults");
        System.out.println( totalnum);
        int totalResults=Integer.valueOf(totalnum);
        assertTrue(totalResults>30);


    }


}
