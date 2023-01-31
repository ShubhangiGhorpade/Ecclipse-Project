package com.file.instanceVar;
//14
public class Medal {
        public String type;
        public String givenBy;
        public String givenFor;
        public int cost;
        public String event;
        public int participates;
        public String reasonOfMedal;
        public String date;
        public int noOfMedals;
        public String medalPosition;
        public String day;
        public String givenTo;
        public String manufactured;
        public boolean cultural;
        

public void initVar(String arg,String arg1,String arg2,int arg3,String arg4,int arg5,String arg6,String arg7,int arg8,String arg9,String arg10,String arg11,String arg12,boolean arg13) {
        type=arg;
        givenBy=arg1;
        givenFor=arg2;
        cost=arg3;
        event=arg4;
        participates=arg5;
        reasonOfMedal=arg6;
        date=arg7;
        noOfMedals=arg8;
        medalPosition=arg9;
        day=arg10;
        givenTo=arg11;
        manufactured=arg12;
        cultural=arg13;
}
public void display() {
	System.out.println("Type :"+type);
	System.out.println("Given By :"+givenBy);
	System.out.println("Given For :"+givenFor);
	System.out.println("Cost :"+cost);
	System.out.println("Event :"+event);
	System.out.println("Participates :"+participates);
	System.out.println("Reason of medal :"+reasonOfMedal);
	System.out.println("Date :"+date);
	System.out.println("No O Medals :"+noOfMedals);
	System.out.println("Medal Position :"+medalPosition);
	System.out.println("Day :"+day);
	System.out.println("Given To :"+givenTo);
	System.out.println("Manufactured :"+manufactured);
	System.out.println("Cultural :"+cultural);
}

}