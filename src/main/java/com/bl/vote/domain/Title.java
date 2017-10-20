package com.bl.vote.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Title {

	private String cardNo;
	private String cashierId="001";
	private String channelId="5";
	private String checkType="2";
	private String docType;
	private String memberId;
	private String orderId;
	private String origCashierId="";
	private String origOrderNo="";
	private String origTicketId="";
	private String payTime;
	private String sendTime;
	private String shopId="000601";
	private String ticketId;
	private String yetaiId="3060";
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCashierId() {
		return cashierId;
	}
	public void setCashierId(String cashierId) {
		this.cashierId = cashierId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getCheckType() {
		return checkType;
	}
	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrigCashierId() {
		return origCashierId;
	}
	public void setOrigCashierId(String origCashierId) {
		this.origCashierId = origCashierId;
	}
	public String getOrigOrderNo() {
		return origOrderNo;
	}
	public void setOrigOrderNo(String origOrderNo) {
		this.origOrderNo = origOrderNo;
	}
	public String getOrigTicketId() {
		return origTicketId;
	}
	public void setOrigTicketId(String origTicketId) {
		this.origTicketId = origTicketId;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getYetaiId() {
		return yetaiId;
	}
	public void setYetaiId(String yetaiId) {
		this.yetaiId = yetaiId;
	}
	
	
	
	
	

	
}
