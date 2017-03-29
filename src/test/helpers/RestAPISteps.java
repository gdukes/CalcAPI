import java.io.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;


public class RestAPISteps {


    public void connectToAPI() throws Throwable {

        HttpClient httpClient = new DefaultHttpClient();


        // this twitter call returns json results.
        // see this page for more info: https://dev.twitter.com/docs/using-search
        // http://search.twitter.com/search.json?q=%40apple

        // Example URL 1: this yahoo weather call returns results as an rss (xml) feed
        //HttpGet httpGetRequest = new HttpGet("http://weather.yahooapis.com/forecastrss?p=80020&u=f");

        // Example URL 2: this twitter api call returns results in a JSON format
        //HttpGet httpGetRequest = new HttpGet("http://api.openweathermap.org/data/2.5/weather?q=London,uk");

        String apiString = "https://www.googleapis.com/customsearch/v1?key=AIzaSyBUsnnw-boX6l5xq2h183aQ3VBCbhyPBP4?snoopy";
        HttpGet httpGetRequest = new HttpGet(apiString);


        // Execute HTTP request
        HttpResponse httpResponse = httpClient.execute(httpGetRequest);

        //System.out.println("----------------------------------------");
        System.out.println(httpResponse.getStatusLine());
        //System.out.println("----------------------------------------");

        // Get hold of the response entity
        HttpEntity entity = httpResponse.getEntity();

        // If the response does not enclose an entity, there is no need
        // to bother about connection release
        byte[] buffer = new byte[1024];

        if (entity != null) {

            InputStream inputStream = entity.getContent();

            int bytesRead = 0;
            BufferedInputStream bis = new BufferedInputStream(inputStream);

            while ((bytesRead = bis.read(buffer)) != -1) {

                String chunk = new String(buffer, 0, bytesRead);
                System.out.println(chunk);
            }

            inputStream.close();

            httpClient.getConnectionManager().shutdown();
        }
    }

}