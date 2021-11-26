package com.example.demo;

public class Error {
    
	private final int code;
	private final String message;

	public Error(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public long getId() {
		return code;
	}

	public String getContent() {
		return message;
	}
}