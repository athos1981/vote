package com.bl.vote.domain;

import java.util.List;
/**
 * 订单对象
 */
public class Bonus {


	private String calculateType;
	private List details;
	private List payments;
	private String sysid="1109";
	private List titles;
	
	public String getCalculateType() {
		return calculateType;
	}
	public void setCalculateType(String calculateType) {
		this.calculateType = calculateType;
	}
	public List getDetails() {
		return details;
	}
	public void setDetails(List details) {
		this.details = details;
	}
	public List getPayments() {
		return payments;
	}
	public void setPayments(List payments) {
		this.payments = payments;
	}
	public String getSysid() {
		return sysid;
	}
	public void setSysid(String sysid) {
		this.sysid = sysid;
	}
	public List getTitles() {
		return titles;
	}
	public void setTitles(List titles) {
		this.titles = titles;
	}
	
	


	
}
