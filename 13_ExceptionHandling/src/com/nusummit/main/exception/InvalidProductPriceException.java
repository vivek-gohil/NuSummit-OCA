package com.nusummit.main.exception;

//Exception - Checked - force you to write try catch
//RuntimeException - Unchecked - 
public class InvalidProductPriceException extends Exception {
	@Override
	public String getMessage() {
		return "Invalid Product Price";
	}
}
