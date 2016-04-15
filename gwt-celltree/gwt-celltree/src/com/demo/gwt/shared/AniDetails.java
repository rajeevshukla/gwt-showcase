package com.demo.gwt.shared;

public class AniDetails {

	private String tnNumber;
	private String locationAddress;
	private boolean clickAble;
	
	public AniDetails(String tnNumber) {
	
		this.tnNumber = tnNumber;
	}
	
	public String getTnNumber() {
		return tnNumber;
	}
	public void setTnNumber(String tnNumber) {
		this.tnNumber = tnNumber;
	}
	public String getLocationAddress() {
		return locationAddress;
	}
	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}
	public boolean isClickAble() {
		return clickAble;
	}
	public void setClickAble(boolean clickAble) {
		this.clickAble = clickAble;
	}
	
}
