import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Parser {

    String intake = "";
    JSONObject obj;

    public Parser() throws ParseException {
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }


    public void print() {
        System.out.println(intake);

       obj =  Convert();

       Lets();


    }



         public JSONObject Convert(){

             JSONObject  jsonObject=new JSONObject();

             JSONParser jsonParser=new  JSONParser();

             if ((intake != null) && !(intake.isEmpty())) {

                 try {

                     jsonObject=(JSONObject) jsonParser.parse(intake);

                 } catch (org.json.simple.parser.ParseException e) {

                     e.printStackTrace();
                 }
             }

             return jsonObject;

         }







    public void Lets() {

        {




                System.out.println("array");

                System.out.println("\nName: " + obj.get("name"));

                System.out.println("Types: " + obj.get("main"));



      }
       }

}
