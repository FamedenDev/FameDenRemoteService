package com.fameden.bean.request;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * This hibernate bean is responsible for storing extra details related to
 * the request stored in the fameden request table.
 * This includes itemName,itemId, cost, paymentMode etc.
 * This will give further details of the request.
 */
@Entity
@Table(name = "FAMEDEN_REQUEST_DETAIL")
public class FamedenRequestDetailBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int requestDetailID;
	private String itemName;
	private String itemID;
	private String itemType;
	private double customerCost;
	private String paymentMode;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "requestID")
	private FamedenRequestBean famedenRequestBean;

	public FamedenRequestBean getFamedenRequestBean() {
		return famedenRequestBean;
	}

	public void setFamedenRequestBean(FamedenRequestBean famedenRequestBean) {
		this.famedenRequestBean = famedenRequestBean;
	}

	public int getRequestDetailID() {
		return requestDetailID;
	}

	public void setRequestDetailID(int requestDetailID) {
		this.requestDetailID = requestDetailID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String i) {
		this.itemID = i;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public double getCustomerCost() {
		return customerCost;
	}

	public void setCustomerCost(double customerCost) {
		this.customerCost = customerCost;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

}
