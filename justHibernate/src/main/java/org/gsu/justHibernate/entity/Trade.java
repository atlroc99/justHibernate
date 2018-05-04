package org.gsu.justHibernate.entity;

import java.io.Serializable;

public class Trade implements Serializable {
	private long tradeId;
	private int qty;
	private String security = null;
	
	public long getTradeId() {
		return tradeId;
	}
	public void setTradeId(long tradeId) {
		this.tradeId = tradeId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	
	@Override
	public String toString() {
		return "Trade [tradeId=" + tradeId + ", qty=" + qty + ", security=" + security + "]";
	}
}
