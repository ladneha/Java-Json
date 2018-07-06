package jsonParsing;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.*;

public class JSONExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// Encode and add values to a JSON object
		JSONObject obj = new JSONObject();
		obj.put("name", "Neha");
		obj.put("age", new Integer(24));
		obj.put("salary", new Double(50000.0));
        System.out.println(obj);
        
        //Encode to JSON format using map
        Map obj1 = new HashMap();
        obj1.put("name", "shweta");
        obj1.put("age", new Integer(28));
        obj1.put("salary", new Double(60000.0));
        String jsonText = JSONValue.toJSONString(obj1);
        System.out.println(jsonText);
        
        //Encode JSON Array
        JSONArray arr = new JSONArray();
        arr.add("Neha");
        arr.add("shweta");
        System.out.println(arr);
        
        //Encode JSON Array using List
        List arr1 = new ArrayList();
        arr1.add("Neha");
        arr1.add("shweta");
        String jsonText1 = JSONValue.toJSONString(arr1);
        System.out.println(jsonText1);
	}
}
