package com.joker.quickweb.exception;

public class NumberException extends RuntimeException {
	
	public NumberException(String msg) {
		super(msg);
	}
	
	public NumberException() {
		super("数量为0");
	}
}
