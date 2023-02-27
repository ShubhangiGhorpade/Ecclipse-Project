package com.xworkz.exception.thing;

public class Event {

		public void eventCreator() throws Throwable {
		System.out.println("Running eventCreator");
		Throwable throwable = new Throwable();
		throw throwable;
	}

	public void exceptionCreator() throws Exception {
		System.out.println("Running exception Creator");
		Exception exception = new Exception();
		throw exception;
	}

	public void error() {
		System.out.println("Running error");
		Error error = new Error();
		throw error;
	}

	public void runtimeException() {
		System.out.println("Running runtimeException");
		RuntimeException runtimeException = new RuntimeException();
		throw runtimeException;
	}
}
