package com.bridgelabz.programs;

public class StockAccount {
	
	 String name;
	 int numberOfShares;
	 int sharePrice;

	 public StockAccount( String name,	 int numberOfShares, int sharePrice) {
		 this.name = name;
		 this.numberOfShares = numberOfShares;
		 this.sharePrice = sharePrice ;
	 }
	 public String getNames() {
		 return name;
	 }
	 
	 public void setName (String name) {
		 this.name = name;
		 
	 }
	 public int  getNumberOfShares() {
		 return numberOfShares;
	 }
	 
	 public void setNumberOfShares (int numberOfShares) {
		 this.numberOfShares = numberOfShares;
		 
	 }
	 public int getSharePrice() {
		 return sharePrice;
	 }
	 public void setSharePrice(int sharePrice) {
		 this.sharePrice = sharePrice;
	 }
	 
	 

}
