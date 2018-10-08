package com.iontrading.groupactivity.BillingANDPricing;

public class HappyHours {
private static HappyHours happyHours = new HappyHours();
	private HappyHours(){
	
}
public static HappyHours getInstance(){
	return happyHours;
}
private int happyHourStart;				//Start hour(24hrs format) for happy hours
private int happyHourEnd;				//End hour(24 hours format) for happy hours
private double happyHourDiscount;		//Discount percent to be offered during happy hours
public int getHappyHourStart() {
	//System.out.println("get"+happyHourStart);
	return happyHourStart;
}
public void setHappyHourStart(int happyHourStart) {
	//System.out.println("set"+happyHourStart);
	this.happyHourStart = happyHourStart;
}
public int getHappyHourEnd() {
	//System.out.println("get"+happyHourEnd);
	return happyHourEnd;
}
public void setHappyHourEnd(int happyHourEnd) {
	//System.out.println("set"+happyHourEnd);
	this.happyHourEnd = happyHourEnd;
}
public double getHappyHourDiscount() {
	//System.out.println("get"+happyHourDiscount);
	return happyHourDiscount;
}
public void setHappyHourDiscount(double happyHourDiscount) {
	//System.out.println("set"+happyHourDiscount);
	this.happyHourDiscount = happyHourDiscount;
}

}
