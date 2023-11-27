package com.springboot.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ErrorDetails {
	
	private LocalDateTime dateTime;
	private String messsage;
	private String path;
	private String errorCode;
	
	
	

}
