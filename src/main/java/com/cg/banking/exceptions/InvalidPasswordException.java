package com.cg.banking.exceptions;

public class InvalidPasswordException extends Exception {
	public InvalidPasswordException() {
		super();
	}
	public InvalidPasswordException(String msg) {
		super(msg);
	}
}
