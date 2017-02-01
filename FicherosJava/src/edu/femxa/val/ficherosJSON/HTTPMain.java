package edu.femxa.val.ficherosJSON;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class HTTPMain {
	
	 public static String getJSON(String urlToRead) throws Exception {
	      
		  StringBuilder result = new StringBuilder();
	      URL url = new URL(urlToRead);
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
	      return result.toString();
	   }

	   public static void main(String[] args) throws Exception
	   {
		   String joson = getJSON("http://elrecadero-ebtm.rhcloud.com/ObtenerListaRecados");
		   Gson gson = new Gson();
		   
		   //Del JSON sacas una lista de recados, para decirle que es una lista en JSON: TypeToken<List<Recado>>
		   List<Recado> l = gson.fromJson(joson, new TypeToken<List<Recado>>(){}.getType());
		   //Recado r = l.get(1);
		   //System.out.println(r.toString());
		   Collections.sort(l);
		   for (Recado recado : l) {
			   System.out.println(recado.toString());
		   }
		   
	   }

}