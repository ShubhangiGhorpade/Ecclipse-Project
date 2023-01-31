package com.file.instanceVar;
//28
public class Beer {
      public String beerName;
      public int cost;
      public String brand;
      public String type;
      public int lifeSpan;
      public int quantity;
      public int rating;
      public int id;
      public String shape;
      public String flavour;
      public int concentration;
      public int alcholContent;
      public int manufactureDate;
      public int expiryDate;
      public boolean giTag;
      public int discount;
      public String buyName;
      public String sellerName;
      public String location;
      public String source;
      public String destination;
      public String modeOfImport;
      public String modeOfExport;
      public long tax;
      public String benefit;
      public String effect;
      public String storeAt;
      public String madeBy;
      public int rank;
      
      public void init(String arg,int arg1,String arg2,int arg3,int arg4,int arg5,int arg6,String arg7,
    		  String arg8,int arg9,int arg10,int arg11,int arg12,boolean arg13,int arg14,
    		  String arg15,String arg16,String arg17,String arg18,String arg19,String arg20,
    		  String arg21,long arg22,String arg23,String arg24,String arg25,String arg26,
    		  int arg27,String arg28) {
    	  beerName=arg;
    	  cost=arg1;
    	  brand=arg2;
    	  lifeSpan=arg3;
          quantity=arg4;
          rating=arg5;
          id=arg6;
          shape=arg7;
          flavour=arg8;
          concentration=arg9;
          alcholContent=arg10;
          manufactureDate=arg11;
          expiryDate=arg12;
          giTag=arg13;
          discount=arg14;
          buyName=arg15;
          sellerName=arg16;
          location=arg17;
          source=arg18;
          destination=arg19;
          modeOfImport=arg20;
          modeOfExport=arg21;
          tax=arg22;
          benefit=arg23;
          effect=arg24;
          storeAt=arg25;
          madeBy=arg26;
          rank=arg27;
    	  type=arg28;
      }
      public void display() {
    	  System.out.println("Type :"+type);
    	  System.out.println("Rank :"+rank);
    	  System.out.println("MadeBy :"+madeBy);
    	  System.out.println("StoreAt :"+storeAt);
    	  System.out.println("Effect :"+effect);
    	  System.out.println("Benefit :"+benefit);
    	  System.out.println("tax :"+tax);
    	  System.out.println("modeOfExport :"+modeOfExport);
    	  System.out.println("modeOfImport :"+modeOfImport);
    	  System.out.println("destination :"+destination);
    	  System.out.println("source :"+source);
    	  System.out.println("sellerName :"+sellerName);
    	  System.out.println("buyName :"+buyName);
    	  System.out.println("discount :"+discount);
    	  System.out.println("giTag :"+giTag);
    	  System.out.println("expiryDate :"+expiryDate);
    	  System.out.println("manufactureDate :"+manufactureDate);
    	  System.out.println("alcholContent :"+alcholContent);
    	  System.out.println("concentration :"+concentration);
    	  System.out.println("flavour :"+flavour);
    	  System.out.println("shape :"+shape);
    	  System.out.println("id :"+id);
    	  System.out.println("rating :"+rating);
    	  System.out.println("quantity :"+quantity);
    	  System.out.println("lifeSpan :"+lifeSpan);
    	  System.out.println("Quantity :"+quantity);
    	  System.out.println(" brand"+brand);
          System.out.println("Cost :"+cost);
          System.out.println("BeerName :"+beerName);
        
      }
      
}
