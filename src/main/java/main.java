import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import javax.script.*;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class main {


    public static void main(String[] args) throws IOException, ParseException {


        Parser parser = new Parser();

        String inline = "";

        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Frome,uk&appid=e4d433c421a7a231d8914ce8f2c3f2db");

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

        System.out.println(inline);

        parser.setIntake(inline);
        parser.print();
    }
}
