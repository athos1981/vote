package com.bl.vote.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;

public class Detail {

	private int baseAmount=0;  
	private String brandSid="001";
	private String categoryid="001";
	private double couponAmount;
	private double discountAmount;
	private String goodsDetSid;
	private String goodsName;
	private double integralValue=0;
	private String itemId;
	private String needintegral="";
	private double origPrice;
	private String pointRatio="";
	private double salePrice;
	private BigDecimal saleQuantity;
	private String supplySid;
	public int getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(int baseAmount) {
		this.baseAmount = baseAmount;
	}
	public String getBrandSid() {
		return brandSid;
	}
	public void setBrandSid(String brandSid) {
		this.brandSid = brandSid;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public double getCouponAmount() {
		return couponAmount;
	}
	public void setCouponAmount(double couponAmount) {
		this.couponAmount = couponAmount;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getGoodsDetSid() {
		return goodsDetSid;
	}
	public void setGoodsDetSid(String goodsDetSid) {
		this.goodsDetSid = goodsDetSid;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getIntegralValue() {
		return integralValue;
	}
	public void setIntegralValue(double integralValue) {
		this.integralValue = integralValue;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getNeedintegral() {
		return needintegral;
	}
	public void setNeedintegral(String needintegral) {
		this.needintegral = needintegral;
	}
	public double getOrigPrice() {
		return origPrice;
	}
	public void setOrigPrice(double origPrice) {
		this.origPrice = origPrice;
	}
	public String getPointRatio() {
		return pointRatio;
	}
	public void setPointRatio(String pointRatio) {
		this.pointRatio = pointRatio;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	public BigDecimal getSaleQuantity() {
		return saleQuantity;
	}
	public void setSaleQuantity(BigDecimal saleQuantity) {
		this.saleQuantity = saleQuantity;
	}
	public String getSupplySid() {
		return supplySid;
	}
	public void setSupplySid(String supplySid) {
		this.supplySid = supplySid;
	}
	
	

	

	
}
