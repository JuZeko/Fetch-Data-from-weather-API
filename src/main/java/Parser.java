import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;


public class Parser {


    String intake = "";
    JSONObject obj;

    String text;
    String text1;



    public Parser() throws ParseException {
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }


    public void print(JTextField textField) {


       obj =  Convert();
        text1  = (String) obj.get("name").toString();
        text  = (String) obj.get("main").toString();
        System.out.println(text);
        textField.setText(text1 + " " + text);
      // Lets();


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

    public String getText() {
        return text;
    }

    public void Lets() {

        {

           // String text  = (String) obj.get("main").toString();


            //text = (String) obj.get("name").toString();

            //text1 = (String) obj.get("main").toString();

           //System.out.println(text + " " + text1);

          //fr.textas =  (String) obj.get("name").toString();

         // fr.text1 = (String) obj.get("main").toString();

               // frames.set(obj.get("name"),obj.get("main"));

      }
       }



        public void putTextNow (JTextField label) {

            System.out.println(text);
           // label.setText(text);
        }



}
