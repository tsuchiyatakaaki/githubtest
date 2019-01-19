package com.example.tutiya.exception;

public class ExampleFatalException extends RuntimeException {

	public ExampleFatalException(){
		super();
	}
	
	public ExampleFatalException(Exception e){
		super(e);
	}
	
	public ExampleFatalException(String message){
		super(message);
	}
	
	public ExampleFatalException(Exception e,String message){
		super(message, e);
	}
}
