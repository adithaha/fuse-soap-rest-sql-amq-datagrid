package org.jboss.fis2.demo.soap;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="phone")
public class Phone {

	private String number;
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
