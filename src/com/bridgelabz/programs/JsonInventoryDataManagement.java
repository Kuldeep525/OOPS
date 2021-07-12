package com.bridgelabz.programs;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonInventoryDataManagement {
	public static void main(String[] args) {
		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader("C:\\Users\\JAI AMBEE\\Desktop\\eclipse\\jsonfiles\\Item.json")) {
			Object obj = jsonParser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			System.out.println(jsonObject); /// till here it will read data from file
			JSONArray itemList = (JSONArray) jsonObject.get("listOfItem");
			System.out.println(itemList);
			Iterator iterator = itemList.iterator();
			long amount, totalamount = 0;
			while (iterator.hasNext()) {
				JSONObject jsonobj1 = (JSONObject) iterator.next();
				long w1 = (long) jsonobj1.get("wieght");
				long p1 = (long) jsonobj1.get("price");

				amount = w1 * p1;
				System.out.println("amount of " + jsonobj1.get("name") + " = " + amount);
				totalamount = amount + totalamount;
			}
			System.out.println("total amount = " + totalamount);

		} catch (IOException e) { ///
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

