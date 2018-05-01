package FriendList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class Utility {

    public static JSONArray readJson(String filename) {
        JSONParser parser = new JSONParser();
        JSONArray jsonArr = null;
        try {
            jsonArr = (JSONArray) parser.parse(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        return jsonArr;
    }

}
