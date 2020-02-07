import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import javax.script.*;

public class Fetch {



    public void action() throws IOException, ParseException {

        Parser parser = new Parser();

        String inline = "";

        URL url = new URL(" https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

        HttpURLConnection conn = (HttpURLConnection)url.openConnection();

      //  https://api.openweathermap.org/data/2.5/weather?q=Kaunas,lt&units=metric&lang=lt&appid=e4d433c421a7a231d8914ce8f2c3f2db");

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

        parser.print();
    }





}
