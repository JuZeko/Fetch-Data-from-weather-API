import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import javax.script.*;
import javax.swing.*;

public class Fetch {



    public void action(String s, JTextField textField) throws IOException, ParseException {




        Parser parser = new Parser();

        String inline = "";

        String place = "";

        if(s == "Kaunas"){

            place = (" https://api.openweathermap.org/data/2.5/weather?q=Kaunas,lt&units=metric&lang=lt&appid=e4d433c421a7a231d8914ce8f2c3f2db");
        }
        else if(s == "Vilnius"){

            place = (" https://api.openweathermap.org/data/2.5/weather?q=Vilnius,lt&units=metric&lang=lt&appid=e4d433c421a7a231d8914ce8f2c3f2db");
        }
        else if(s == "Panevezys"){

            place = (" https://api.openweathermap.org/data/2.5/weather?q=Panevezys,lt&units=metric&lang=lt&appid=e4d433c421a7a231d8914ce8f2c3f2db");
        }

        else if(s == "Klaipeda"){

            place = (" https://api.openweathermap.org/data/2.5/weather?q=Klaipeda,lt&units=metric&lang=lt&appid=e4d433c421a7a231d8914ce8f2c3f2db");
        }

        URL url = new URL(place);

        HttpURLConnection conn = (HttpURLConnection)url.openConnection();


        conn.setRequestMethod("GET");

        conn.connect();


        int responsecode = conn.getResponseCode();



        if(responsecode != 200)

            throw new RuntimeException();

        else

        {

            Scanner sc = new Scanner(url.openStream());


            while(sc.hasNext())

            {

                inline+=sc.nextLine();

            }



            sc.close();

        }




        parser.setIntake(inline);

        parser.print(textField);
    }


    }






