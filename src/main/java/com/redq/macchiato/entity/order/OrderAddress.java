package com.redq.macchiato.entity.order;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.redq.macchiato.entity.BaseEntity;

@Entity
@Table(name = "o_order_address")
public class OrderAddress extends BaseEntity{
	
	private Long orderId;
	
	private String recipient;
	
	private String phone;
	
	private Long zoneId;
	
	private String zoneStr;

	private Long street;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getZoneId() {
		return zoneId;
	}

	public void setZoneId(Long zoneId) {
		this.zoneId = zoneId;
	}

	public String getZoneStr() {
		return zoneStr;
	}

	public void setZoneStr(String zoneStr) {
		this.zoneStr = zoneStr;
	}

	public Long getStreet() {
		return street;
	}

	public void setStreet(Long street) {
		this.street = street;
	}

}
