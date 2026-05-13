package task2weatherprediction;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
  
import org.json.JSONObject;
public class Weatherprediction {
	  public static void main(String[] args) {

	        try {
	           
	            String apiKey = "3691755be98f9b6631471ef1811ed584";
	            String city = "Chennai";

	            String urlString = "https://api.openweathermap.org/data/2.5/weather?q="
	                    + city + "&appid=" + apiKey + "&units=metric";

	            URL url = new URL(urlString);
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

	            conn.setRequestMethod("GET");

	            int responseCode = conn.getResponseCode();

	            if (responseCode == 200) {   
	                BufferedReader reader = new BufferedReader(
	                        new InputStreamReader(conn.getInputStream()));

	                StringBuilder response = new StringBuilder();
	                String line;

	                while ((line = reader.readLine()) != null) {
	                    response.append(line);
	                }

	                reader.close();

	                // Parse JSON
	                JSONObject obj = new JSONObject(response.toString());

	                String cityName = obj.getString("name");
	                double temperature = obj.getJSONObject("main").getDouble("temp");
	                int humidity = obj.getJSONObject("main").getInt("humidity");
	                String weather = obj.getJSONArray("weather")
	                                    .getJSONObject(0)
	                                    .getString("description");

	                // Display Output
	                System.out.println("------ Weather Report ------");
	                System.out.println("City: " + cityName);
	                System.out.println("Temperature: " + temperature + "°C");
	                System.out.println("Humidity: " + humidity + "%");
	                System.out.println("Condition: " + weather);

	            } else {
	                System.out.println("Error in API request. Response Code: " + responseCode);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
