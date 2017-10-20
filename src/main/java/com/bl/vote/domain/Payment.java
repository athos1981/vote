package com.bl.vote.domain;

import javax.persistence.Entity;

public class Payment {

	private String needintegral="";
	private double payAmount;
	private String payModeId;
	private String payModeName;
	private String pointRatio="";
	public String getNeedintegral() {
		return needintegral;
	}
	public void setNeedintegral(String needintegral) {
		this.needintegral = needintegral;
	}
	public double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayModeId() {
		return payModeId;
	}
	public void setPayModeId(String payModeId) {
		this.payModeId = payModeId;
	}
	public String getPayModeName() {
		return payModeName;
	}
	public void setPayModeName(String payModeName) {
		this.payModeName = payModeName;
	}
	public String getPointRatio() {
		return pointRatio;
	}
	public void setPointRatio(String pointRatio) {
		this.pointRatio = pointRatio;
	}

	
	
	

	
}
