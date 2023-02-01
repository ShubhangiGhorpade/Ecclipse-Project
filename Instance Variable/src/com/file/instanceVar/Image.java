package com.file.instanceVar;
//10
public class Image {
 public String type;
 public int pixel;
 public String colour;
 public int date;
 public String day;
 public String event;
 public String capturedBy;
 public int time;
 public int cost;
 public int size;
 
 public Image() {
	 System.out.println("No arg constructor");
 }
public Image(int arg) {
	 pixel=arg;
 }
public Image(String arg) {
	 type=arg;
}
public Image(String arg,int arg1) {
	 type=arg;
	 cost=arg1;
}
public Image(int arg,String arg1) {
	 cost=arg;
	 event=arg1;
}
public Image(String arg,String arg1) {
	 event=arg;
	 capturedBy=arg1;
}
public Image(String arg,String arg1,String arg2) {
	 day=arg;
	 event=arg1;
	 capturedBy=arg2;
}
public Image(String arg,int arg1,String arg2) {
	 day=arg;
	 cost=arg1;
	 event=arg2;
}
public Image(String arg,int arg1,int arg2) {
	 event=arg;
	 cost=arg1;
	 size=arg2;
}
public Image(int arg,int arg1,int arg2) {
	 cost=arg;
	 size=arg1;
	 time=arg2;
}
public void display() {
	System.out.println("cost :"+cost);
	System.out.println("size :"+size);
	System.out.println("time :"+time);
	System.out.println("event :"+event);
	System.out.println("pixel :"+pixel);
	System.out.println("colour :"+colour);
	System.out.println("capturedBy :"+capturedBy);
	System.out.println("date :"+date);
	System.out.println("day :"+day);
	System.out.println("type :"+type);

}
}
