package com.bridgelabz.programs;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockAccountManagement {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader  = new FileReader("C:\\Users\\JAI AMBEE\\Desktop\\eclipse\\jsonfiles\\Stock.json"))
		{
			Object obj = jsonParser.parse(reader);      
			JSONObject jsonObject = (JSONObject) obj;     
			System.out.println(jsonObject);
			JSONArray stockArray  = (JSONArray) jsonObject.get( "listOfStock") ;
			System.out.println(stockArray); 
			System.out.println();
			System.out.println("--------------stock report--------------- ");
			Iterator iterator = stockArray.iterator();
			long ValueOfStock , TotalValueOfStock = 0;
			while (iterator.hasNext()) {
				JSONObject jsonObject1 = (JSONObject) iterator.next();
				System.out.println("Number of share is " + jsonObject1.get("numberOfShare"));
				System.out.println(" Share price is " +jsonObject1.get("sharePrice"));

				long numOfShare = (long) jsonObject1.get("numberOfShare");
				long sharePrice = (long) jsonObject1.get("sharePrice");

				ValueOfStock = numOfShare *sharePrice;
				System.out.println("Value of each stock is " + jsonObject1.get("stock_name") + " = " + ValueOfStock);	
				TotalValueOfStock = ValueOfStock + TotalValueOfStock;		
			}
			System.out.println();
			System.out.println("Total value of stock is " + TotalValueOfStock);
			
			
		}  catch (IOException e) {
		
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
