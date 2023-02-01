package com.file.instanceVar;
//5
public class Message {
public String sender;
public String receiver;
public int cost;
public boolean international;
public String type;

public Message() {
	
}
public Message(String arg) {
	sender=arg;
}
public Message(int arg) {
	cost=arg;
}
public Message(boolean arg) {
	international=arg;
}
public Message(int arg,boolean arg1) {
	cost=arg;
	international=arg1;
}
public void display() {
	System.out.println("cost :"+cost);
	System.out.println("international :"+international);
	System.out.println("sender :"+sender);
	System.out.println("receiver :"+receiver);
	System.out.println("type :"+type);
}
}
