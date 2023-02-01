package com.file.instanceVar;
//8
public class Train {
public String name;
public int trainNo;
public int cost;
public char chamber;
public String type;
public String source;
public String dest;
public boolean express;

public Train() {
	
}
public Train(String arg) {
	name=arg;
}
public Train(int arg) {
	cost=arg;
}
public Train(char arg) {
	chamber=arg;
}
public Train(boolean arg) {
	express=arg;
}
public Train(String arg,int arg1) {
	name=arg;
	cost=arg1;
}
public Train(boolean arg,int arg1) {
	express=arg;
	cost=arg1;
}
public Train(int arg,int arg1) {
	cost=arg;
	trainNo=arg1;
}
public void display() {
	System.out.println("cost :"+cost);
	System.out.println("express :"+express);
	System.out.println("trainNo :"+trainNo);
	System.out.println("name :"+name);
	System.out.println("chamber :"+chamber);
	System.out.println("type :"+type);
	System.out.println("source :"+source);
	System.out.println("dest :"+dest);
	
}
}
