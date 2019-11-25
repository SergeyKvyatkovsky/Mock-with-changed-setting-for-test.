import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.internal.filter.ValueNode;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.lang.reflect.Method;

public class Util {
    private static final String PathFromJSON = ".\\mappings\\pos-health#Get-OK.json";

    /**
      Method wich use package named by json-path.
     */

    public void methodParse() throws IOException, ParseException {
        org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
        JSONObject object = (JSONObject) parser.parse(new FileReader(PathFromJSON));
        System.out.println(object);

        String message = JsonPath.read(object.toJSONString(), "$.mappings[0].request.method");
        String messageT =JsonPath.parse(object.toJSONString()).set("$.mappings[7].response.jsonBody","111111").jsonString(); // Path example
        System.out.println(message);
        System.out.println(messageT);

    }

}
