/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import java.io.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class App {

    public static void main(String[] args) throws Exception {
        getQuoteData();
    }

    protected static String printRandomObject(Object[] objArray) {

        int size = objArray.length;

        int randomIndex = (int) Math.floor(Math.random() * size);

        System.out.print(objArray[randomIndex].toString());
        return objArray[randomIndex].toString();
    }



    protected static Object[] jsonToQuote(String string) {
        Gson gson = new GsonBuilder().serializeNulls().create();

        return gson.fromJson(string, Quote[].class);
    }

    public static class Quote {
        public String author;
        public String text;

        public Quote(String author, String text) {
            this.author = author;
            this.text = text;

        }

        public String toString() {
            return String.format("%s: %s", this.author, this.text);
        }

    }

    public class Formismatic {
        protected String quoteText;

    }


    protected static String getQuoteData() throws Exception {
        try {
            URL url = new URL("https://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream())));
            Gson gson = new Gson();
            Formismatic formismatic = gson.fromJson(reader, Formismatic.class);
            System.out.println(formismatic.quoteText);
            return formismatic.quoteText;

        } catch (Exception e) {
            File file = new File("./src/main/resources/recentquotes.json");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            StringBuilder outputString = new StringBuilder();
            while ((st = br.readLine()) != null) {
                outputString.append(st);
            }
            return printRandomObject(jsonToQuote(outputString.toString()));
        }
    }

}
