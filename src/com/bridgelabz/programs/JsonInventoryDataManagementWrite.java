package com.bridgelabz.programs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonInventoryDataManagementWrite {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		JSONObject inventoryDetails = new JSONObject();
		inventoryDetails.put("name" , "rice");
		inventoryDetails.put("Price", 60);
		inventoryDetails.put("weight", 1);
		
		JSONObject inventoryObject1 = new JSONObject();
		inventoryObject1.put("inventory1", inventoryDetails);
		
		JSONObject inventoryDetails2 = new JSONObject();
		inventoryDetails2.put("name" , "Wheat");
		inventoryDetails2.put("Price", 59);
		inventoryDetails2.put("weight", 1);
		
		JSONObject inventoryObject2 = new JSONObject();
		inventoryObject2.put("inventory2", inventoryDetails2);
		
		JSONObject inventoryDetails3 = new JSONObject();
		inventoryDetails3.put("name" , "pulses");
		inventoryDetails3.put("Price", 50);
		inventoryDetails3.put("weight", 1);
		
		JSONObject inventoryObject3 = new JSONObject();
		inventoryObject3.put("inventory3", inventoryDetails3);
		
	    
		
		JSONArray inventoryArray = new JSONArray();
		inventoryArray.add(inventoryObject1);
		inventoryArray.add(inventoryObject2);
		inventoryArray.add(inventoryObject3);
		
		try {
			FileWriter file = new FileWriter("C:\\Users\\JAI AMBEE\\Desktop\\eclipse\\jsonfiles\\Item2.json");
			file.write(inventoryArray.toJSONString());
			
			file.flush();
		
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------Data Added to Item.json File Successfully----------------");
		
		
	}

}
