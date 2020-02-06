import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Parser {

    String intake = "";

    public Parser() throws ParseException {
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }
    public void print() {
        System.out.println(intake);

    }



   // JSONParser parse = new JSONParser();

   // JSONObject jobj = (JSONObject) parse.parse(intake);

  //  JSONArray jsonarr_1 = (JSONArray) jobj.get("results");


    /*public void Lets() {

        {
            for (int i=0;i<jsonarr_1.size();i++) {

                JSONObject jsonobj_1 = (JSONObject) jsonarr_1.get(i);

                System.out.println("array");

                System.out.println("\nPlace id: " + jsonobj_1.get("place_id"));

                System.out.println("Types: " + jsonobj_1.get("types"));


            }
      }
       }
    */
}
