package com.file.instanceVar;

public class Flight {
    public String flightName;
    public int cost;
    public String flightType;
    public int noOfSeats;
    public char chamber;
    public String flightCode;
    public String flightDest;
    public int timeOfDeparture;
    public int flightNo;
    public boolean privateJet;
    
    public void initVar(String arg,int arg1,String arg2,int arg3,char arg4,String arg5,String arg6,int arg7,int arg8,boolean arg9) {
    	flightName=arg;
    	cost=arg1;
    	flightType=arg2;
    	noOfSeats=arg3;
    	chamber=arg4;
    	flightCode=arg5;
    	flightDest=arg6;
    	timeOfDeparture=arg7;
    	flightNo=arg8;
    	privateJet=arg9;
     }
    
    public void display() {
    	System.out.println("Flight Name :"+flightName);
    	System.out.println("Cost :"+cost);
    	System.out.println("Flight Type :"+flightType);
    	System.out.println("No Of Seat :"+noOfSeats);
    	System.out.println("Chamber :"+chamber);
    	System.out.println("Flight Code :"+flightCode);
    	System.out.println("Flight Destination :"+flightDest);
    	System.out.println("Time Of Departure :"+timeOfDeparture);
    	System.out.println("Flight Number :"+flightNo);
    	System.out.println("Private jet or not :"+privateJet);
    }
    
    
    
    
    
    
    
    
}
