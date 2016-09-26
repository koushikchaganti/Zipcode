package com.koushikchaganti.pincode.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	private String errormessage;
	private int errorcode;
	private String documentation;
	
	public ErrorMessage() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ErrorMessage(String errormessage, int errorcode, String documentation) {
		super();
		this.errormessage = errormessage;
		this.errorcode = errorcode;
		this.documentation = documentation;
	}



	/**
	 * @return the errormessage
	 */
	public String getErrormessage() {
		return errormessage;
	}
	/**
	 * @param errormessage the errormessage to set
	 */
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	/**
	 * @return the errorcode
	 */
	public int getErrorcode() {
		return errorcode;
	}
	/**
	 * @param errorcode the errorcode to set
	 */
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	/**
	 * @return the documentation
	 */
	public String getDocumentation() {
		return documentation;
	}
	/**
	 * @param documentation the documentation to set
	 */
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
	
}
