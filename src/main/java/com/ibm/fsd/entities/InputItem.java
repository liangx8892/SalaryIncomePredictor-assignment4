package com.ibm.fsd.entities;

public class InputItem {
	private String inputMessage;
	private String invalidMessage;
	private String value;
	private String pattern;
	private boolean isValid;
	
	public InputItem(String inputMessage, String invalidMessage,
					 String pattern) {
		this.inputMessage = inputMessage;
		this.invalidMessage = invalidMessage;
		this.pattern = pattern;
	}
	
	public String getInputMessage() {
		return inputMessage;
	}
	public void setInputMessage(String inputMessage) {
		this.inputMessage = inputMessage;
	}
	public String getInvalidMessage() {
		return invalidMessage;
	}
	public void setInvalidMessage(String invalidMessage) {
		this.invalidMessage = invalidMessage;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	public boolean validate(String value) {
		boolean isValid = false;
		if(value != null && value.trim().length() > 0) {
			isValid = value.matches(this.pattern);
		}
		this.isValid = isValid;
		return isValid;
	}
	
	public boolean isValid() {
		return this.isValid;
	}
}
