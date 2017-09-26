package org.jboss.fis2.demo.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Status {

	private String code;
	private String message;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
