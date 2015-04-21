package com.springmvc.bean;

/**
 * @author Liuxp
 *
 */
public class Other {

	private int otherId;
	private String otherName;

	public int getOtherId() {
		return otherId;
	}

	public void setOtherId(int otherId) {
		this.otherId = otherId;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public Other(int otherId, String otherName) {
		super();
		this.otherId = otherId;
		this.otherName = otherName;
	}

	public Other() {
		super();
	}

}
