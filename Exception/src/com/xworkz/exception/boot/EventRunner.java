package com.xworkz.exception.boot;

import com.xworkz.exception.thing.Event;

public class EventRunner {

	public static void main(String[] args) {
		Event event = new Event();
		try {
			System.out.println("Running in try");
			event.eventCreator();
			event.exceptionCreator();
			event.runtimeException();

		} catch (RuntimeException e) {
			System.err.println("Catched in runtimeException");
		} catch (Exception e) {
			System.err.println("Catched in Exception");
		} catch (Throwable e1) {
			System.err.println("continuing the throwable");
		}
	}

}
